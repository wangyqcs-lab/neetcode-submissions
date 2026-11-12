class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> hav = new HashMap<>();
        Map<Character, Integer> has = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            hav.put(s.charAt(i), hav.getOrDefault(s.charAt(i), 0)+1);
            has.put(t.charAt(i), has.getOrDefault(t.charAt(i), 0)+1);
        }
        return Objects.equals(hav, has);
    }
}
