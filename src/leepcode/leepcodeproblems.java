package leepcode;

public class leepcodeproblems {
    //https://leetcode.com/problems/string-to-integer-atoi/description/?envType=problem-list-v2&envId=string

    public static void main(String [] args){
        System.out.println(myAtoi("   -42"));
    }
    public static int myAtoi(String s){
        int i=0;
        int sign=1;
        long result=0;
        int n=s.length();

        // Step 1: Skip whitespace
        //by incrementing the i value we no need to begin with space
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        // Step 2: Check sign
        // Assigning sign value if -then assigned as -1 orelse 1
        if(i<n && s.charAt(i)=='+'||s.charAt(i)=='-'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        // Step 3: Read digits
//        here is the corelogic
//        int digit = s.charAt(i) - '0';
//        Converting a character to a number
//        Characters like '3' or '7' aren’t numbers yet—they’re ASCII characters.
//        Subtracting '0' converts them to their numeric value.
//        0 value is 48
//        3-0 =51-48

//        Building the number
//        result = result * 10 + digit;
//        This shifts the previous digits left and adds the new one.
//        Example with "137":
//        - Start: result = 0
//                - Read '1': result = 0 * 10 + 1 = 1
//                - Read '3': result = 1 * 10 + 3 = 13
//                - Read '7': result = 13 * 10 + 7 = 137
//        This is exactly how humans read numbers left‑to‑right.

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            result=result*10+digit;
            if(sign==1&&result>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign ==-1&&-result<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)(result*sign);
    }

}
