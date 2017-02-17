/* LeetCode #383: Ransom Note
Given an arbitrary ransom note string and another string containing letters from all the magazines,
write a function that will return true if the ransom note can be constructed from the magazines ;
otherwise, it will return false.
Each letter in the magazine string can only be used once in your ransom note.
*/

import java.util.HashMap;
import java.util.Map;

// HashMap for get, put
public class RansomNote {
    public boolean canConstruct(String ransomNote,String magazine){
        Map<Character, Integer> magazineToExist = new HashMap<Character, Integer>(); // char, # times
        for (int i = 0; i < magazine.length(); i++){
            Character currentChar = magazine.charAt(i); // get incrementing index of character (start 0: 1st letter etc)
            Integer numTimes = magazineToExist.get(currentChar); // Returns value of specific char

            if (numTimes == null){ // If this is the first occurrence of the character
                magazineToExist.put(currentChar, 1); // key, value -> current character, first occurrence
                continue; // move onto next step
            }
            magazineToExist.put(currentChar, ++numTimes); // if it's not the first occurrence, add value (+1) to current key (current character)
        }

        for (int i = 0; i < ransomNote.length(); i++){ // Check if ransom note can be implemented.
            Character ransomNoteCurrent = ransomNote.charAt(i); // same as Magazine, getting incrementing index for character
            Integer numTimes = magazineToExist.get(ransomNoteCurrent); // Returns value of specific char
            if(numTimes == null || numTimes <= 0){ // Ransom note can't be built with correct # of characters
                return false;
            }
            magazineToExist.put(ransomNoteCurrent, --numTimes); //  Put key, value but decrement numTimes
            // Putting "characters for ransom note into magazine."
        }
        return true;
    }

    public static void main (String[] args){
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("aa", "aab"));
        System.out.println(rn.canConstruct("andrew", "werdna"));
        System.out.println(rn.canConstruct("banana", "pineapple"));
        System.out.println(rn.canConstruct("a", "b"));

    }
}
