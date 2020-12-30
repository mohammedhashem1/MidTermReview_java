package mapreviewmidterm;

import java.util.*;

public class MapHashMapMethod {
  static int [] run ={10,20,15,25,35,45,10,20,15,25,35,45,10,20,25,35,45,10,20,10,20,25,35,45,50,25,35,45,55,55,
            10,20,15,25,35,45,10,20,15,25,35,45,10,20,25,35,45,10,20,10,20,25,35,45,50,25,35,45,55,55,
            10,20,15,25,35,45,10,20,15,25,35,45,10,20,25,35,45,10,20,10,20,25,35,45,50,25,35,45,55,55
    };
    public static void  runInfo( int [] bat){
        HashMap<Integer,Integer> serial=new HashMap<>();
        for(int i=0;i<bat.length;i++){
          Integer best= serial.get(bat[i]);
          if(serial.get(bat[i])==null ){
              serial.put(bat[i],1);
          }else{
              serial.put(bat[i],++best);
          }
        }
        for (Map.Entry<Integer,Integer> st:serial.entrySet()
             ) {
            System.out.println("Number Is "+st.getKey()+": Iterate is :"+st.getValue());
        }

    }
 static HashSet<Integer> roll=new HashSet<>();


    public static void main(String[] args) {
        MapHashMapMethod.runInfo(run);
        roll.add(60);
        roll.add(70);
        roll.add(80);
        roll.add(90);
        roll.add(100);
        for (Integer mark:roll) {
            System.out.println("The serial number is :"+roll);
        }
        roll.add(999);
        for (Integer mark:roll) {
            System.out.println("The serial number is :"+roll);
        }
        roll.clear();
        for (Integer mark:roll) {
            System.out.println("The serial number is :"+roll);
        }
        System.out.println(roll.contains(70));
        System.out.println(roll.remove(4));
        System.out.println(roll.size());
        System.out.println(roll.clone());

        player.add("Junaid");
        player.add("Khalid");
        player.add("Akbar");
        player.add("Munner");
        player.add("Hashem");
        System.out.println(player.size());
        System.out.println(player.remove("Munner"));
        player.remove("Junaid");
        System.out.println(player.equals("Hashem"));
        for (String st:player) {
            System.out.println(st);
        }
        setInfo();
    }

  static   Set<String > player=new HashSet<>();
   public  static void setInfo() {
       int[] exam = {10, 20, 30, 40, 20, 30, 20, 30, 40, 50, 30, 40, 50, 60, 70, 80, 100, 20, 10, 50, 20};
       int[] mark = {50, 100, 10, 40, 30, 50, 70, 80, 100};
       Set<Integer> perform = new HashSet<>();
       perform.addAll(Arrays.asList(new Integer[]{10, 20, 30, 40, 20, 30, 20, 30, 40, 50, 30, 40, 50, 60, 70, 80, 100, 20, 10, 50, 20}));
        Set<Integer> record=new HashSet<>();
        record.addAll(Arrays.asList(new Integer[]{50, 100, 10, 40, 30, 50, 70, 80, 100}));
        Set<Integer> retrieve=new HashSet<>(perform);

        //UNION
        retrieve.retainAll(record);
       System.out.println("Union "+retrieve);
       // INTERSECTION
       retrieve.addAll(record);
       System.out.println(retrieve);
       //Difference
       retrieve.containsAll(record);

       System.out.println(retrieve);
       retrieve.removeAll(record);
       System.out.println(retrieve);
       int [] select={10,20,30,40,50,35,45,55,65,75,65,55,85,45,20,30,50,75,100};
       int [] player={15,25,35,45,55,70,90,85,100,50,75,90,100};

       Set<Integer> call=new HashSet<>();
       call.addAll(Arrays.asList(new Integer[]{10,20,30,40,50,35,45,55,65,75,65,55,85,45,20,30,50,75,100 }));
       Set<Integer> obj=new HashSet<>();
       obj.addAll(Arrays.asList(new Integer[]{15,25,35,45,55,70,90,85,100,50,75,90,100 }));




   }
}

