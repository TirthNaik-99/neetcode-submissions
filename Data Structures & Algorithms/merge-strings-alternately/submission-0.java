class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int a = 0;
        int b = 0;
        while(a < word1.length() || b < word2.length()){
            if(a < word1.length()){
                result.append(word1.charAt(a));
                a++;
            }
            if(b < word2.length()){
                result.append(word2.charAt(b));
                b++;
            }
        }
        return result.toString();
    }
}