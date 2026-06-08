class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int left = 0;
        int right = 0;

        while(right < abbr.length()){
            if(Character.isLetter(abbr.charAt(right))){
                if(left >= word.length() || word.charAt(left) != abbr.charAt(right)){
                    return false;
                }
                left++;
                right++;
            }else if(Character.isDigit(abbr.charAt(right))){
                if(abbr.charAt(right) == '0'){
                    return false;
                }
                int num = 0;
                while(right < abbr.length() && Character.isDigit(abbr.charAt(right))){
                    num = num * 10 + (abbr.charAt(right) - '0');
                    right++;
                }
                left += num;
            }
        }
        return left == word.length();
    }
}