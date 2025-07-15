package programmers.level2;

class Solution {
    public int zc, fc;
    public String tobinary(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1'){
                sb.append(s.charAt(i));
            }else {
                zc += 1;
            }
        }
        char[] arr = Integer.toBinaryString(sb.length()).toCharArray();
        return new String(arr);
    }
    public int[] solution(String s) {
        
        while(s.length() != 1) {
            fc += 1;
            s = tobinary(s);
        }
        int[] answer = new int[2];
        answer[0] = fc;
        answer[1] = zc;
        return answer;
    }
}
