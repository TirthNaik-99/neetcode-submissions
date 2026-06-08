class Solution {
    public boolean isAnagram(String s, String t) {

        // char[] c1 = s.toCharArray();
        // char[] c2 = s.toCharArray();

        if (s.length() != t.length()){
            return false;
        }

        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        for ( char c1 : s.toCharArray())
        {
            String key1 = String.valueOf(c1);
            hm1.put(key1, hm1.getOrDefault(key1, 0) + 1);
        }

        for ( char c2 : t.toCharArray())
        {
            String key2 = String.valueOf(c2);
            hm2.put(key2, hm2.getOrDefault(key2, 0) + 1);
        }

        return hm1.equals(hm2);
        

    }
}
