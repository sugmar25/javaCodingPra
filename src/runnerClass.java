public class runnerClass {

     public static void usingLamda() {
         interfaceExample longDistanceRunning = (Marathon) -> "what run" + Marathon;
         System.out.println(longDistanceRunning.run("Mini Marathon"));
     }

     public static void normalMethos(){
         interfaceExample shortDistance = new interfaceImplementation();
         System.out.println(shortDistance.run("Sprint event"));

     }

    public static void main(String [] args){
        usingLamda();
        normalMethos();

    }
}
