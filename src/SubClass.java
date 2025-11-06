import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//example for constructor class
public class SubClass {
    static String playerName;
    static String eventName;
    static String runningCategory;


    public SubClass(String playerName, String eventName, String runningCategory) {
        this.playerName = playerName;
        this.eventName = eventName;
        this.runningCategory = runningCategory;
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "playerName='" + playerName + '\'' +
                ", eventName='" + eventName + '\'' +
                ", runningCategory='" + runningCategory + '\'' +
                '}';
    }


    public static String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public static String getRunningCategory() {
        return runningCategory;
    }

    public void setRunningCategory(String runningCategory) {
        this.runningCategory = runningCategory;
    }

    public static void main(String[] args) {
        SubClass firstGame = new SubClass("Dhoni", "Cricket", "ShortDistancerunning");
        //SubClass SecondGame = new SubClass("Ronaldo","Foodball","LongDistance");
        System.out.println(firstGame.playerName);
        //IO.println(SecondGame);
        printDuplicateChar();

        List<Integer> printNumbers = Arrays.asList(1,2,4,67,8,7,4,3,9);
        printNumbers.forEach(x->System.out.print(x));

    }

    public static void printDuplicateChar() {
        String raceName = SubClass.getRunningCategory();
        System.out.println(raceName);
        Set<Character> duplicatChar = new HashSet<>();
        Map<Character, Long> getDuplicateChar = raceName.chars().mapToObj(x -> (char) x).filter(x -> x != ' ')
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        System.out.println(getDuplicateChar);
        
    }

    //Lamda expression




}
