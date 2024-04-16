package leetcode;

public class M12_validateIPAddress {
  public String validIPAddress(String IP) {
    if(isValidIPv4(IP))
      return "IPv4";
    else if(isValidIPv6(IP))
      return "IPv6";
    else
      return "Neither";
  }

  private boolean isValidIPv4(String ip) {
    if(ip.length()<7) return false;
    if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.') return false;
    String[] tokens = ip.split("\\.");
    if(tokens.length!=4) return false;
    for(String token:tokens) {
      if(!isValidIPv4Token(token)) return false;
    }
    return true;
  }

  private boolean isValidIPv4Token(String token) {
    if(token.startsWith("0") && token.length()>1) return false;
    try {
      int parsedInt = Integer.parseInt(token);
      if(parsedInt<0 || parsedInt>255) return false;
      if(parsedInt==0 && token.charAt(0)!='0') return false;
    } catch(NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  private boolean isValidIPv6(String ip) {
    if(ip.length()<15) return false;
    if(ip.charAt(0)==':' || ip.charAt(ip.length()-1)==':') return false;
    String[] tokens = ip.split(":");
    if(tokens.length!=8) return false;
    for(String token: tokens) {
      if(!isValidIPv6Token(token)) return false;
    }
    return true;
  }

  private boolean isValidIPv6Token(String token) {
    if(token.length()>4 || token.isEmpty()) return false;
    char[] chars = token.toCharArray();
    for(char c:chars) {
      boolean isDigit = c>=48 && c<=57;
      boolean isUppercase = c>=65 && c<=70;
      boolean isLowerCase = c>=97 && c<=102;
      if(!(isDigit || isUppercase || isLowerCase))
        return false;
    }
    return true;
  }

}
