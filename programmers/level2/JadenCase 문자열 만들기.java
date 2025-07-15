package programmers.level2;

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c) || c == ' '){
                sb.append(c);
                continue;
            }
            if(sb.length() == 0 || sb.charAt(sb.length() - 1) == ' ') {
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return sb.toString();
    }
}