import java.text.Collator;
import java.util.*;

public class IntManipulation {

    static List<Integer> inputNumbers = List.of(1,2,3,4,5,6,7,8,9,7,5,33,56,7989,44,567,899,34);
    public static void main(String [] args){
        sumofNo();
        sumofNum();
        findMaxandMinNumber();
        swapNumbers();
        divtwo();
        secondHighestNum();
        compareTwoNum();
    }

    public static void sumofNo(){
        int [] input ={1,2,3,4,5,6,7,8,9};
        int countnumber = 0;
        for(int addnumber : input){
            countnumber+=addnumber;
        }
        System.out.println(countnumber);
    }

    public static void sumofNum(){
        List<Integer> sumNumbers = List.of(1, 2, 3, 4, 5, 6);
        sumNumbers.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }

    public static void findMaxandMinNumber(){
        List<Integer> maxandMinNumber = List.of(11,12,1,54,1,9,7,54,25,64,1);
        int maxNumber= maxandMinNumber.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println(maxNumber);
        int minNumber= maxandMinNumber.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println(minNumber);
        maxandMinNumber.stream().distinct().forEach(System.out::print);
        System.out.println("\n");
        maxandMinNumber.stream().sorted().forEach(System.out::print);
        System.out.println("\n");
        maxandMinNumber.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println("\n");
    }

    public static void swapNumbers() {
        int a = 10;
        int b = 20;
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a +" "+ b);
    }

    public static void divtwo(){
        List<Integer> inputNumbers = List.of(1,2,3,4,5,6,7,8,9,7,5,33,56,7989,44,567,899,34);
        inputNumbers.stream().filter(x->x%2==0).forEach(System.out::print);
        System.out.println("\n");
        inputNumbers.stream().filter(x->x%2!=0).forEach(System.out::print);
        System.out.println("\n");
        inputNumbers.stream().map(x->x*x).forEach(System.out::print);
        System.out.println("\n");
        inputNumbers.stream().max(Integer::compare).ifPresent(System.out::print);
        System.out.println("\n");
        inputNumbers.stream().min(Integer::compare).ifPresent(System.out::print);
    }

    public static void secondHighestNum(){
        inputNumbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .ifPresent(System.out::print);
    }

    public static void compareTwoNum(){
        System.out.println("\n");
        List<Integer> compareList = List.of(1,2,3,4,5,6,7,8,9);
        inputNumbers.stream().filter(compareList::contains).distinct().sorted().forEach(System.out::print);
        Map<String,Integer> students = new HashMap<String, Integer>();
        students.put("sugumar",25);
        students.put("dhrithi",16);
        students.put("abinaya",26);
        students.put("jeeva",45);
        students.put("sampath",61);
        students.values().stream().filter(integer -> integer % 2 == 0).
                reduce(Integer::sum).ifPresent(System.out::println);

    }



}
