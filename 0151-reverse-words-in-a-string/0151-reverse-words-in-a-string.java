class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            //removing all trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //i ki value check kro 
            if( i < 0 ){
                break;
            }
            int j = i;
            //find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            ans.append(s.substring(j+1, i+1));
            //faltu ke spaces remove krna hai ab
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //j < 0 , no space needed 
            // j >= 0 , space needed
            if(j >= 0 ){
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();
    }
}