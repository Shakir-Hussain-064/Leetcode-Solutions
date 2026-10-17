class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            //search part in s string
            int index = s.indexOf(part);
            //new string banegi ab
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }
}