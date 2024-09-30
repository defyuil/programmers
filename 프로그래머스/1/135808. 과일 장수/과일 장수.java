import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int price = 0;
        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            price += score[i-m] * m;
        }
        return price;
    }
}