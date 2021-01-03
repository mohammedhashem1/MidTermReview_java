package mapreviewmidterm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Group_01_02_2021 {

   List< String > city=new ArrayList<>();
   List<Integer> player=new ArrayList<>();
   List<Integer> population=new LinkedList<>();
   Queue<String> student=new LinkedList<>();

   public void structureInfo(){
       city.add("Dhaka");
       city.add("Lahore");
       city.add("Long Island");
       city.add("Manhattan");
       System.out.println(city.add("Manhattan"));
       //city.remove("Lahore");
       System.out.println(city.add("Queen's"));
       city.add("Dyckman");
       for (String ct:city) {
           System.out.println(ct);
       }
       System.out.println( city.equals("Long Island"));
       System.out.println(city.contains("Lahore"));
      //=======================================================
      player.add(90000);
      player.add(70000);
      player.add(60000);
      player.add(50000);
       System.out.println(player.get(0));
       System.out.println(player.contains(50000));
       System.out.println(player.add(140000));
       for (Integer pl:player) {
           System.out.println("Player Income :"+pl);
       }
       System.out.println(player.contains(70000));
       System.out.println(player.remove(1));
      //==================================================
      population.add(10000000) ;
      population.add(20000000) ;
      population.add(30000000) ;
      population.add(40000000) ;
      population.add(50000000) ;
       System.out.println(population.get(0));
       System.out.println(population.remove(3));
       System.out.println(population.contains(20000000));
       for (Integer pl:population) {
           System.out.println(pl);
       }
      population.add(2345678) ;
       for (Integer pl:population) {
           System.out.println(pl);
       }

       student.add("Junaid");
       student.add("Khalid");
       student.add("Akbar");
       student.add("Muneer");
       student.add("Hitta");

      // Queue : Interface ; LinkedList Class implements Queue
      // student.poll();//Retrieve and Remove
//       System.out.println(student.poll());
//       System.out.println(student.poll());
//       System.out.println(student.poll());
//       System.out.println(student.peek());// Retrieve but doesn't delete the element
//       System.out.println(student.poll());
//       System.out.println(student.poll());
//       for (String st:student) {
//           System.out.println(st);
//       }
       student.add("Pakistan");
       for (String st:student) {
           System.out.println(st);
       }
       System.out.println(  student.element());

       System.out.println(student.offer("Hitta"));
       System.out.println(student.contains("Pakistan"));
       System.out.println(student.toString());
     //  System.out.println(student.hashCode());
       System.out.println(student.isEmpty());
   }


    public static void main(String[] args) {
        Group_01_02_2021 key =new Group_01_02_2021();
        key.structureInfo();


    }


}
