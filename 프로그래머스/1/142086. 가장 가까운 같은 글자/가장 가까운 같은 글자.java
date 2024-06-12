class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i=1; i<s.length(); i++){
            for(int z=i-1; z>=0; z--){        
                if(s.charAt(i)==s.charAt(z)){
                    answer[i] = i-z;
                    break;
                }else{
                    answer[i] = -1;
                }
            }
        }
        return answer;
    } 
}