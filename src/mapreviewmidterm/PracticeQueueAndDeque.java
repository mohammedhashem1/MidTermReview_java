package mapreviewmidterm;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeQueueAndDeque {

 static Queue<String> team=new LinkedList<>();//PriorityQueue]
    //==============================================
   static Queue<Integer> number=new PriorityQueue<>();
    public static  void queueInfo(){
        number.add(90000);
        number.add(190000);
        number.add(290000);
        number.add(390000);
      // System.out.println(number.poll());
        System.out.println(number.peek());
        System.out.println(number.contains(390000));
        System.out.println(number.offer(1900000));
        System.out.println(number.element());
        System.out.println(number.equals(90000));
    }


    public static void main(String[] args) {
        PracticeQueueAndDeque.queueInfo();

        System.out.println("*******************************************");


        team.add("Hockey");
        team.add("Cricket");
        team.add(" Football ");
        team.add("Kabadi");
        team.add("Border Fighting");
        System.out.println( team.peek());
        System.out.println(team.element());
        System.out.println(team.poll());
        System.out.println(team.poll());
        System.out.println(team.toString());
        System.out.println(team.offer("Kabadi"));
        System.out.println(team.contains("Border Fighting"));
        // Contains  method show Boolean type
        // OFFER METHOD SHOW BOOLEAN TYPE
    }



}
