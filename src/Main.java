import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    IO.println(sumOfAllNumbers());

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    List<Integer> printNumbers = List.of(9, 3, 16, 7, 25, 26,7, 9,10, 18,29);
    List<Integer> compareNumbers = List.of(1, 2, 3, 4, 5, 6,7,8,9,10);

    //just to print values instead of for loop
    printNumbers.stream().forEach(System.out::println);
    //To print even numbers
    printNumbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    printNumbers.stream().reduce(Integer::sum).stream().forEach(System.out::println);
    //finding largest number
    IO.println(printNumbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x:y));
    //to find smallest number
    IO.println(printNumbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x > y ? y: x));
    // unique values in sorted form
    printNumbers.stream().distinct().sorted().forEach(System.out::println);
    // reverse order
    printNumbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    // squre all the numbers
    printNumbers.stream().map(x->x*x).forEach(System.out::println);
    // squre all the numbers and add all the numbers
    printNumbers.stream().map(x->x*x).reduce(Integer::sum).stream().forEach(System.out::println);
    // squre all the numbers and find max
    printNumbers.stream().map(x->x*x).max(Integer::compare).stream().forEach(System.out::println);
    // squre all the numbers and find min
    printNumbers.stream().map(x->x*x).min(Integer::compare).stream().forEach(System.out::println);
    // To add into new collector and update the list
    List<Integer> createNewList = printNumbers.stream().collect(Collectors.toList());
    IO.println(createNewList);
    createNewList.add(70);
    createNewList.addAll(Arrays.asList(20,34,11,24,56,78));
    IO.println(createNewList);

    //Compare both the list and print duplicate numbers
    printNumbers.stream().filter(compareNumbers::contains).distinct().sorted().forEach(System.out::println);

    List<String> printString = List.of("sugumar Sampath");
    String notListString = "Dhrithi Sugumar";
    char [] converStrinChar = notListString.toCharArray();
    int [] arrayNum = {12,3,56,78,89,56,43,57};
    Arrays.stream(arrayNum).sorted().filter(x->x%2==0).forEach(System.out::println);
    //in string if need to print only unique data
    IntStream.range(0,converStrinChar.length).mapToObj(i->converStrinChar[i]).sorted().distinct().forEach(System.out::print);
    Set<Character> getRepeatedChar = new HashSet<>();
    Set<Character> duplicateWords = new HashSet<>();
    IntStream.range(0,converStrinChar.length).mapToObj(i->converStrinChar[i]).filter(x->!getRepeatedChar.add(x)).forEach(duplicateWords::add);
    System.out.println(duplicateWords);
    IntStream.range(0,converStrinChar.length).mapToObj(i->converStrinChar[i]).filter(x->!getRepeatedChar.add(x)).forEach(duplicateWords::add);

    Set<Character> printDuplicateChar = notListString.chars().mapToObj(x->(char)x).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    printDuplicateChar.forEach(System.out::print);

    //String coding practices for printing duplicate character
    Set<Character> getRepeatedChar2 = new HashSet<>();
    Set<Character> printDuplicateChar2 = notListString.chars().mapToObj(x->(char)x).filter(x->!getRepeatedChar2.add(x)).collect(Collectors.toSet());
    System.out.println(System.lineSeparator());
    printDuplicateChar2.forEach(System.out::print);
    System.out.println(System.lineSeparator());

    //print duplicate character and its count
    String printDuplicateCout = "i love my job to much";
    Map<Character,Long> sepCharCount = printDuplicateCout.chars().mapToObj(x->(char)x).filter(x->x!=' ').collect(Collectors.groupingBy(x->x,Collectors.counting()))
            .entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
    sepCharCount.forEach((k, v) -> System.out.println(k + " → " + v));

}

    public Integer sumOfAllNumbers() {
        List<Integer> printNumbers = List.of(9, 3, 16, 7, 25, 26, 10, 18);
        return printNumbers.stream().reduce(0, (x, y) -> x + y);
    }
