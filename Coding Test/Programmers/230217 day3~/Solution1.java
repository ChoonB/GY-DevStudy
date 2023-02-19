package day3;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> method1(int a, int b, int c) {
        List<Integer> abc = new ArrayList();

        int target = 0;

        if (a == b){
            while (target <= c){
                abc.add(target);
                target++;
            }
            return abc;
        }
        return abc;
    }
}

class test2 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        List result = solution1.method1(1,1, 5);
        System.out.println(result);
    }
}
