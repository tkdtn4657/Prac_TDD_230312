package com.ll.p120906;

public class Solution {
    public int solution(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}