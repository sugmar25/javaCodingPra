import java.util.Arrays;

public class TwoPointers {

    public static void main(String [] args){
        reverseString();
        twoSumWithTwoPointer(new int[]{5, 4, 7, 8, 9, 1, 0, 10, 21, 45, 25},11);
        twoPointerValueOfIntersection(new int[]{1,5,7,70,10,16,45,25},new int[]{12,5,6,67,45,25,16});

    }

    public static void reverseString(){
        String str="Dhrithisugumar";
        char[] strchar =str.toCharArray();
        int left =0, right = strchar.length-1;
        while (left < right){
            //Swap mechanism
            char temp = strchar[right];
            strchar[right --]=strchar[left];
            strchar[left++]=temp;
        }
        System.out.println(new String(strchar));
    }

    //two sum
    private static void twoSumWithTwoPointer(int[] input, int target) {
        Arrays.sort(input);
        int left = 0, right = input.length-1;
        while (left < right){
            int sum=input[left]+input[right];
            if(sum == target ){
                System.out.println("Left index: " + left + " (value: " + input[left] + ")");
                System.out.println("Right index: " + right + " (value: " + input[right] + ")");
                break;
            }
            else if (sum<target){
                left++;
            }
            else {
                right--;
            }
        }
    }

    private static void twoPointerValueOfIntersection(int[] inputValue1, int[] inputValue2) {
        Arrays.sort(inputValue1);
        Arrays.sort(inputValue2);
       int left =0, right =0;
           while(left < inputValue1.length && right < inputValue2.length){
               if (inputValue1[left]==inputValue2[right]){
                   System.out.println("Got the intersection move left and right and print the values" + inputValue1[left]);
                   left++;
                   right++;
               } else if (inputValue1[left]<inputValue2[right]) {
                   left++;
               }
               else{
                   right++;
               }

           }

       }

}
