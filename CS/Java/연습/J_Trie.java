import java.util.*;
public class J_Trie {
    static class Node {
        // 자식노드 담을 Map
        Map<Character, Node> childNode = new HashMap<>();
        // 끝을 판별하는 플래그 변수
        boolean isEnd;
    }

    public static class Trie{
        // 루트노드는 아무 문자도 담지않고 생성
        Node rootNode;

        Trie(){
            rootNode = new Node();
        }

        // 삽입
        void insert(String str){
            // 항상 루트 노드부터 시작
            Node node = this.rootNode;
            // trie에 해당 문자열이 없으면 새로 노드를 만들어 파고내려간다.
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                node = node.childNode.computeIfAbsent(c,key -> new Node());
            }
            // 마지막 노드의 플래그를 활성화
            node.isEnd = true;
        }
        // 검색
        boolean contains(String str){
            // 루트노드부터 시작
            Node node = this.rootNode;
            // getOrDefault로 해당 문자가 없으면 null을 넣어 false를 반환.
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                node = node.childNode.getOrDefault(c, null);
                if(node == null) return false;
            }
            // 해당 문자열이 다 있고 마지막 노드의 플래그가 true여야 끝이기 때문에 플래그를 반환
            return node.isEnd;
        }

        void delete(String str){
            delete(this.rootNode, str, 0);
        }

        private void delete(Node node, String str, int index){
            char c = str.charAt(index);
            if(!node.childNode.containsKey(c)){
                throw new RuntimeException("해당 글자열이 없어 삭제할 수 없습니다.");
            }

            Node child = node.childNode.get(c);
            index++;

            if(index == str.length()){
                if(!child.isEnd) throw new RuntimeException("해당 글자열이 없어 삭제할 수 없습니다.");
                child.isEnd = false;
                if(child.childNode.isEmpty()){
                    node.childNode.remove(c);
                }
            } else {
                delete(child, str, index);

                if(!child.isEnd && child.childNode.isEmpty()){
                    node.childNode.remove(c);
                }
            }




        }
    }

    
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("baseball");
        trie.insert("basketball");
        trie.insert("bus");
        trie.insert("tax");

        System.out.println("baseball 포함 여부 :" + trie.contains("baseball"));
        System.out.println("base 포함 여부 : " + trie.contains("base"));
        System.out.println("taxi 포함 여부 : " + trie.contains("taxi"));
        System.out.println("bus 포함 여부 : " + trie.contains("bus"));
        System.out.println("bus 삭제");
        trie.delete("bus");
        System.out.println("bus 포함 여부 : " + trie.contains("bus"));
        System.out.println("basketball 포함 여부 : " + trie.contains("basketball"));

        
    }
}
