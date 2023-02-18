package day3;

public class 챌_신규아이디추천 {
    public String solution(String new_id) {
//        1.대문자를 소문자로
        String id3 = new_id.toLowerCase();
//        2.소문자 - _ . 제외 다 제거
        id3 = id3.replaceAll("[^0-9a-z_.-]","");
//        3. .가 연속이면 한개만
        while (id3.contains("..")){
            id3 = id3.replace("..",".");
        }
//        4. .가 처음이나 끝이면 제거
        if (id3.charAt(0) == '.'){
            id3 = id3.substring(1);
        }
        if(id3.length()>0){
            if (id3.charAt(id3.length()-1) == '.'){
                id3 = id3.substring(0,id3.length()-1);
            }
        }
//        5. 빈문자열이면 a 대입
        if (id3.length() == 0){
            id3 = "a";
        }
//        6. 16자 이상이면 나머지 다 제거 제거후 .가 맨끝이면 제거
        if (id3.length()>=16){
            id3 = id3.substring(0,15);
        }
        if (id3.charAt(id3.length()-1) == '.'){
            id3 = id3.substring(0,id3.length()-1);
        }

//        7. 2자 이하면 마지막 문자 길이 3될때 까지 반복
        if (id3.length()==1){
            id3 = id3 + id3 + id3;
        }
        if (id3.length()==2){
            id3 += id3.substring(1);
        }

        String answer = id3;
        return answer;
    }

    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
        챌_신규아이디추천 result = new 챌_신규아이디추천();
        System.out.println(result.solution(new_id));
    }
}

