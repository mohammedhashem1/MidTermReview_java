package recursionpractice;

public class LearnRecursion {
    static int apple = 10;
    public  static void recursiveInfo() {
        /**
         * Recursion is a basic programming technique you can use in Java, in which a method calls itself to solve some problem.
         * A method that uses this technique is recursive. Many programming problems can be solved only by recursion,
         * and some problems that can be solved by other techniques are better solved by recursion.
         */

        if (apple >= 5) {
            apple--;
            recursiveInfo();
            System.out.println("Recursive method");
        }
    }

    public static void main(String[] args) {// Main Method Start
LearnRecursion.recursiveInfo();
LearnRecursion.repeatInfo();
LearnRecursion.gameInfo();
    }// Main Method End

     static int   player=0;
    public static  void gameInfo(){

        //LearnRecursion obj =new LearnRecursion();
        player++;
        if(player<=4){
            System.out.println("Cricketer get more money than footballer");
          gameInfo();// recursive
        }

    }

    static int orange=7;

    public  static void repeatInfo() {
     orange--;
        if(orange>=3){
            System.out.println("Mahmud bai not taking class");
            repeatInfo();
        }

    }

}