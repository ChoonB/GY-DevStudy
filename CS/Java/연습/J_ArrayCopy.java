public class J_ArrayCopy {
    static class MyObject {
        int value;
        MyObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // 1차원 기본형 배열 clone 복사
        int[] A = {1,2,3,4,5};
        int[] B = A.clone();

        A[0] = 50;
        System.out.println("B[0]의 값은 " + B[0]);
        // 출력값 1. 바뀌지 않음

        // 2차원 배열 clone 얕은 복사
        int[][] C = {{1,2,3}, {4,5,6}};
        int[][] D = C.clone();

        C[0][0] = 300;
        System.out.println("D[0][0]의 값은 " + D[0][0]);
        // 출력값 300. 원본 수정시 바뀜
        
        // 2차원 배열 깊은 복사
        C[0][0] = 1;
        int[][] E = new int[C.length][];
        
        for(int i=0; i<C.length; i++){
        	E[i] = C[i].clone();
        }
        
        C[0][0] = 500;
        System.out.println("E[0][0]의 값은 " + E[0][0]);
        // 출력값 1. 독립성 가짐.

        // 1차원 참조형 배열 clone
        MyObject[] originalArray = { new MyObject(1), new MyObject(2) };
        MyObject[] clonedArray = originalArray.clone();

        // 원본 배열의 첫 번째 객체의 값을 변경
        originalArray[0].value = 10;

        System.out.println(clonedArray[0].value);  
        // 출력값은 10. 원본에서 수정해서 복사본에서도 같이 바뀜.
        
    }
}
