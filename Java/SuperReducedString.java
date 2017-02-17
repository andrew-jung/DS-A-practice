import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(reduce(s));
    }
    
    private static String reduce(String s){
        int height = 0;
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek().equals(s.charAt(i))){
                stack.pop();
                height--;
            } else{
                stack.push(s.charAt(i));
                height++;
            }
        }
        if (height == 0){
            return "Empty String";
        }
        
        char reduced[] = new char[height]; // array length of H increments
        for (int i = height-1; i >= 0; i --){
            reduced[i] = stack.pop();
        }
        return new String(reduced);
    }
}