class Solution 
{
    public String reverseWords(String word, char ch) {
        int index = word.indexOf(ch);
         if (index >= 0) {
             StringBuilder sb = new StringBuilder();
             sb.append(word.substring(0, index + 1)).reverse().append(word.substring(index + 1, word.length()));
                return sb.toString();
            } 
            return word;
        }
}
   
//    class ReversePrifix {       
//         public static void main(String[] args) {
//             String word = "abcdefd";
//             char ch = 'd';
//             Solution s = new Solution();
//             String result = s.reverseWords(word, ch);
//             System.out.println(result);
//         }
//     }

 