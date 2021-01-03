package mapreviewmidterm;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapInfo {

 static  Map<String,String> city=new HashMap<>();

    public void mapInfo(){
        city.put("USA","New York");
        city.put("Pakistan","Islamabad");
        city.put("Bangladesh","Dhaka");
        city.put("NewYork","Albany");
        city.put("Manhattan"," Time Square");
        System.out.println(city);
        System.out.println(city.entrySet());
        System.out.println(city.keySet());
        System.out.println(city.containsKey("Manhattan"));
        System.out.println(city.containsValue("Dhaka"));

        System.out.println(city.put("USA","New York"));
        for (Map.Entry<String,String> town:city.entrySet()) {
            System.out.println(town.getKey()+": "+town.getValue());
        }
        for (String obj:city.keySet()
             ) {
            System.out.println("Best  :"+obj+"  Like :"+city.get(obj));
        }
        //=======================================================================================
        int [] run={100,50,40,20,10,25,60,20,35,50,100,20,50,35,50,100,60,40,100,90,90,100,40,50,60,
                100,50,40,20,10,25,60,20,35,50,100,20,50,35,50,100,60,40,100,90,90,100,40,50,60,
                100,50,40,20,10,25,60,20,35,50,100,20,50,35,50,100,60,40,100,90,90,100,40,50,60,
                100,50,40,20,10,25,60,20,35,50,100,20,50,35,50,100,60,40,100,90,90,100,40,50,60
        };
        HashMap<Integer,Integer> bat=new HashMap<>();
        for (int i=0;i<run.length;i++){
        Integer match  =bat.get(run[i]);
        if(bat.get(run[i])==null ){
            bat.put(run[i],1);
        } else{
           bat.put(run[i],++match) ;
        }
        }
        for (Map.Entry<Integer,Integer> son: bat.entrySet()) {
            System.out.println(son.getKey() + ":" + son.getValue());
        }
    }

    public static void main(String[] args) {
        MapHashMapInfo obj=new MapHashMapInfo() ;
        obj.mapInfo();
    }

}
