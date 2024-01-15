package leetcode;
/*
14. Longest Common Prefix
http://leetcode.com/problems/longest-common-prefix
 */

public class L03_longgestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    String s1 = strs[0];
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<s1.length(); i++){
      char c = s1.charAt(i);
      boolean flag = true;
      for(int j=1; j<strs.length; j++){
        if(strs[j].length()-1<i) {
          flag = false;
          break;
        }

        char d = strs[j].charAt(i);
        if(c!=d) {
          flag = false;
          break;
        }
      }
      if(flag) {
        sb.append(c);
      } else {
        break;
      }
    }

    if(sb==null) return "";
    return sb.toString();
  }

  public static void main(String[] args) {
    L03_longgestCommonPrefix l = new L03_longgestCommonPrefix();
    String[] str1 = new String[]{"flower","flow","flight"};
    System.out.println(l.longestCommonPrefix(str1));
  }

}
