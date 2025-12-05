import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulations {

    public static void main (){
        System.out.println(reverseString("Dhrithisugumar"));
        addNumbers();
        removeDuplicate();
        printRepetedChar();
        removeduplicate();
        printMaxOccDuplicate();
        validateDigit();
        removeWhiteSpace();
        System.out.println(stringRotation("abcd","abcd"));
        rotatekposition();
        System.out.println(palindrom());
        reverseWords();
        nonrepating();
        System.out.println(anagram("listen","silent"));
        findDup();
        countvowles();
        subStringwithoutrep();

    }

    public static String reverseString(String input){
        char [] revString = input.toCharArray();
        StringBuilder reveredString = new StringBuilder();
        for(int i=revString.length-1; i>=0;i--){
            reveredString.append(revString[i]);
        }
        return reveredString.toString();
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

    public static boolean stringRotation(String str1, String str2){
        if (str1.length()!=str2.length())
            return false;
        return (str1+str1).contains(str2);
    }

    public static void rotatekposition(){
        String str="iloveyoujava";
        int rotate=2;
        int k=str.length()/rotate;
        String afterRotation = str.substring(k) + str.substring(0,k);
        System.out.println(afterRotation);
    }

    //To check given string is palindrom or not
    public static boolean palindrom(){
        String str ="sugus";
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    // Reverse each words
    public static void reverseWords(){
        String str ="try until you die";
        List<String> reversedword = Arrays.asList(str.split(" "));
        Collections.reverse(reversedword);
        String reversed = String.join(" ",reversedword);
        System.out.println(str);
        System.out.println(reversed);

    }

    //first non-repeating character
    public static void nonrepating(){
        String str ="deliveryhero";
        Map<Character,Object> firstFistRept= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).findFirst()
                .stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(firstFistRept);
    }

    //check Anagram
    public static boolean anagram(String str1, String str2){
        if (str1.length()!=str2.length()) return false;
        char [] chastr1 =str1.toCharArray();
        char [] chastr2 =str2.toCharArray();
        Arrays.sort(chastr1);
        Arrays.sort(chastr2);
        return Arrays.equals(chastr1,chastr2);
    }

    //Duplicate words
    public static void findDup(){
        String str = "This is a test and this test is simple";
        List<String> dupChar=Arrays.stream(str.toLowerCase().split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(dupChar);
    }

    //count Vowles
    public static void countvowles(){
        String str1 ="ilovewhatiamdoing";
        long countlet= str1.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)>=1).count();
        System.out.println(countlet);
    }

    //Substring without repeating word
    public static void subStringwithoutrep(){
        String str ="abcdabcd";
        Set<Character> set = new HashSet<>();
        int left =0, max=0;
        for(int right=0;right<str.length();right++){
            while (set.contains(str.charAt(right)))
                set.remove(str.charAt(left++));
            set.add(str.charAt(right));
            max =Math.max(max,right-left+1);
        }
        System.out.println(max);
        Map<Character,Object> printDuplicate =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream()
                .filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(printDuplicate);

        str.chars().mapToObj(c->String.valueOf((char)c));
    }
}
