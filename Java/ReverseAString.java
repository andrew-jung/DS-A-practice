// LeetCode #344: Reverse String
// Write a function that takes a string as input and returns the string reversed.
// TODO: IMPLEMENT FASTER, THIS IS SLOW

public class ReverseAString {
    public String reverseString(String s){
        String reverse = ""; // Initialize blank string to hold reverse.
        int stringLength = s.length(); // Original string length

        for (int i = stringLength-1; i >= 0; i--){ // Start at max index and append to reverse
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public String reverseFaster(String s){
        char[] word = s.toCharArray(); // Create a char array from input string.
        int i = 0;
        int j = s.length() - 1; //
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
    public static void main (String[] args){
        ReverseAString rs = new ReverseAString();
        String test = rs.reverseString("werdna");
        System.out.println(test);
    }
}
