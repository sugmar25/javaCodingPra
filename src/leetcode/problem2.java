package leetcode;

/****7. Reverse Integer
Medium
        Topics
premium lock icon
        Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).***/
//https://leetcode.com/problems/reverse-integer/description/
public class problem2 {
    public static void main(String []args){
        System.out.println(reverse(120));
    }
    public static int reverse(int x) {
        int rev=0;

        while(x!=0){
            int pop=x%10;// last digit
            x=x/10;// remove last digit


            // Check overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev=rev*10+pop;
        }
        return rev;
    }
}
