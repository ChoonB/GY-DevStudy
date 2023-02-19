package day2;

public class Solution1 {
    public void method1(int args) {
        System.out.println(args + 1);
    }
}

class Solution2 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.method1(5);
    }
}