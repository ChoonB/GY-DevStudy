package p1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class J_문자열파싱 {

    public static void main(String[] args) {
        // 1. substring

        String input = "Hello, World!";
        int index = input.indexOf("World");
        String result = input.substring(index);
        System.out.println(result);

        // 2. split
        String input2 = "korea,japan,china";
        String[] nations = input2.split(",");
        System.out.println(Arrays.toString(nations));

        //3. StringTokenizer
        String str = "동해물과 백두산이 마르고 닳도록";
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
