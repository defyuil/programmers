class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0, otherCount = 0;
        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                xCount++;
            } else {
                otherCount++;
            }

            if (xCount == otherCount) {
                answer++;

                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
                xCount = 0;
                otherCount = 0;
            }
        }

        if (xCount != 0 || otherCount != 0) {
            answer++;
        }

        return answer;
    }
}
