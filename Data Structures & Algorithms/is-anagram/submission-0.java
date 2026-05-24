

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] ar = s.toCharArray();
        char[] arr = t.toCharArray();

        Arrays.sort(ar);
        Arrays.sort(arr);

        if (Arrays.equals(ar, arr)) {
            return true;
        }

        return false;
    }
}