import java.util.HashSet;

/* LeetCode #202: Happy Number
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.
*/
public class HappyNumber {

    // n = 19 % 10 = 9
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)){
            //System.out.println(n);
            set.add(n);
            //System.out.println("get 1.5: " + n);
            n = calcSum(n);
            //System.out.println("get 2.5: " + n);

            if(n==1)
                return true; // 1 is happy, 1² = 1

            //System.out.println("get 3: " + n);
        }
        return false;
    }

    public int calcSum(int n){ // called in loop
        int sum = 0;
        while(n > 0){
            //System.out.println("get 2: " + n);
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
public static void main (String[] args){
    HappyNumber hn = new HappyNumber();
    //System.out.println(hn.isHappy(19));
    }
}



