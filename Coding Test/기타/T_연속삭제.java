package level3;

public class T_연속삭제 {

  public int solution(String s, int[] n){
    int sum = 0;

    for (int i = 0; i < s.length()-1; i++) {
      char a = s.charAt(i);
      char b = s.charAt(i+1);
      if (a==b){
        if (n[i]>n[i+1]){
          sum += n[i+1];
          n[i+1] = n[i];
        } else {
          sum += n[i];
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    T_연속삭제 t = new T_연속삭제();
    String s = "aaabbb";
    int[] n = {1,2,5,4,3,6};
    System.out.println("정답은 :" + t.solution(s,n));
  }

}
