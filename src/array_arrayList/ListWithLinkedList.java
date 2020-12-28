package array_arrayList;

import javax.swing.*;
import java.util.*;
import java.util.List;

public class ListWithLinkedList {
    List<Integer> apple=new ArrayList<Integer>();

    public static void main(String[] args) {
        ListWithLinkedList key =new ListWithLinkedList();
        key.apple.add(75);
        key.apple.add(85);
        key.apple.add(95);
        key.apple.add(105);
        System.out.println(key.apple.get(3));
        key.apple.remove(1);
        System.out.println(key.apple.get(2));
        key.apple.add(300);
        for (Integer num:key.apple) {
            System.out.println("Review number :"+num);
        }
        System.out.println(key.apple.equals(85));
        ListWithLinkedList.cricketInfo();
        worldRecord();
        foodMenu();
        ListWithLinkedList.serialNum();

    }
    static Map<String,Integer> record=new HashMap<>();
    public static  void worldRecord(){
        record.put("Bangladesh",1600000);
        record.put("India",20000000);
        record.put("Pakistan",14000000);
        record.put("Srilanka",3000000);
        for (  Map.Entry<String,Integer> st:record.entrySet()) {
            System.out.println("Country :"+st.getKey()+"; Population :"+st.getValue());
        }
    }

    List<String> food=new LinkedList<>();

    public static void foodMenu(){
        ListWithLinkedList menu=new ListWithLinkedList();
        menu.food.add("Dhaka");
        menu.food.add("Khulna");
        menu.food.add("Commilla");
        menu.food.add("Rajshahi");
        menu.food.add("Sylhet");
        for (String eat: menu.food) {
            System.out.println("Best food is :"+eat);
        }
    }

    static List<Integer> num=new LinkedList<>();
    public static void serialNum(){
        num.add(55);
        num.add(65);
        num.add(75);
        num.add(85);
        num.add(95);
        System.out.println(num.get(3));
        System.out.println( num.remove(3));
        System.out.println(num.get(3));
        for (Integer abc:num) {
            System.out.println(abc);
        }
        System.out.println(num.contains(85));
        System.out.println(num.equals(75));
        System.out.println(num.add(125));
        for (Integer abc:num) {
            System.out.println(abc);
        }
    }
    

List<String>team=new ArrayList<>();
    public  static void cricketInfo(){
       ListWithLinkedList obj=new ListWithLinkedList();
       obj.team.add("Abahoni");
       obj.team.add("Mohammedan");
       obj.team.add("Brother's");
       obj.team.add("FakiraPool");
       obj.team.add("Real Madrid");
        System.out.println(obj.team.equals("Abahoni"));
        System.out.println(obj.team.get(2));
       obj.team.remove(3) ;
        for (String best:obj.team) {
            System.out.println("The good team in the World is:"+best);
        }
        obj.team.add("MohonBagan");
        for (String good:obj.team) {
            System.out.println("All the name of the name :"+good);
        }
        Map<String,String> countries=new HashMap<String,String>();
        countries.put("Bangladesh","Dhaka");
        countries.put("India","Delhi");
        countries.put("Pakistan","Islamabad");
        countries.put("Afganistan","Kabul");
        countries.put("Srilanka","Katkmandu");
        System.out.println(countries.get("Bangladesh"));
        for (Map.Entry<String,String> citizen:countries.entrySet()) {
            System.out.println("The name of the countries Is"+citizen.getKey()+": Capital is :"+citizen.getValue());
        }
        for (String famous:countries.keySet()) {
            System.out.println("The citizen of the countries is ;"+famous+": city is :"+countries.get(famous));
        }
        Map<String,String> player=new HashMap<String, String>();
        player.put("Argentina","Massi");
        player.put("Protughal","Ronaldo");
        player.put("Brazil","Pele");
        player.put("Bangladesh","Salauddin");
        player.put("Eghypt","Salah");
        System.out.println(player.get("Brazil"));
        for (Map.Entry<String,String> pl:player.entrySet()) {
            System.out.println(pl.getKey()+"  : Player is ="+pl.getValue());
        }
        for (String st:player.keySet()) {
            System.out.println(st+" ;"+player.get(st));
        }
        Map<String,Integer> population=new HashMap<>();
        population.put("Bangladesh",180000000);
        population.put("India",2000000000);
        population.put("Pakistan",16000000);
        population.put("USA",320000000);
        population.put("Russia",70000000);

        for (Map.Entry<String,Integer> pl:population.entrySet()) {
            System.out.println("The name of the country is :"+pl.getKey()+"; Population Is :"+pl.getValue());
        }
        for (String pl:population.keySet()) {
            System.out.println("The population of the countries is ;"+pl+": Density Is :"+population.get(pl));
        }

    }




}
