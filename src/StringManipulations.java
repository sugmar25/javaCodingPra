import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulations {

    public static void main (){
        System.out.println(reverseString("Dhrithisugumar"));
        System.out.println(Addnumbers());
        addNumbers();
        removeDuplicate();
        printRepetedChar();
        removeduplicate();
        printMaxOccDuplicate();
        validateDigit();
        removeWhiteSpace();

    }

    public static String reverseString(String input){
        char [] revString = input.toCharArray();
        StringBuilder reveredString = new StringBuilder();
        for(int i=revString.length-1; i>=0;i--){
            reveredString.append(revString[i]);
        }
        return reveredString.toString();
    }


    public static int Addnumbers(){
        int addednumbers = 0;
       int[] sumNumbers = {1, 2, 3, 4, 5, 6};
       for(int num:sumNumbers){
           addednumbers+=num;
       }
        return addednumbers;
    }

    public static void addNumbers(){
        List<Integer> sumNumbers = List.of(1, 2, 3, 4, 5, 6);
        sumNumbers.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }

    public static void removeDuplicate(){
        String removeDuplicate = "Dhrithisugumar";
        String removedWords=removeDuplicate.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(removedWords);
    }
    public static void printRepetedChar(){
        String inputChar = "Dhrithisugumar";
        inputChar.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()+""+e.getValue()));
    }

    public static void removeduplicate(){
        String inputword = "IlovecodingonJava";
        String uniquewords = inputword.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(uniquewords);

    }

    public static void printMaxOccDuplicate(){
        String str="ilovedeliveryhero";
       Map<Character,Long> maxReapeatedChar= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(repchar->repchar.getValue()>1)
                .max(Map.Entry.comparingByValue()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(maxReapeatedChar.keySet());
    }

    public static void validateDigit(){
       String inputString = "124457895ajbuhinugjh";
        String digitValue= inputString.replaceAll("[^0-9]","");
        String charValue=inputString.replaceAll("[^A-Za-z]","");
        System.out.println(digitValue);
        System.out.println(charValue);
    }

    public static void removeWhiteSpace(){
        String str = "I love What I am Doing";
        String charWithoutspace=str.chars().filter(st->st!=' ').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(charWithoutspace);
    }
}
