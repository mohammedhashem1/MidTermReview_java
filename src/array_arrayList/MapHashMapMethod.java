package array_arrayList;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapMethod {
    int [] player={10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
            10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
            10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,0,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
            10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
            10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
            10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50
    };

    public void minInfo(int [] persons){
        int select=persons[0];//10
        for(int i=0;i<persons.length;i++){
            if(select>persons[i]){
                select=persons[i];
            }
        }
        System.out.println("The minimum number is :"+select);
    }

    public void junaidInfo(){
        MapHashMapMethod value=new MapHashMapMethod();
        value.minInfo(value.player);

        int [] player={10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
                10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
                10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,0,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
                10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
                10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50,
                10,30,40,50,50,30,25,15,25,35,56,56,65,89,25,35,78,69,79,69,70,30,10,10,40,30,20,30,40,50,50,50
        };
        HashMap<Integer,Integer>  score=new HashMap<>();
        for( int a=0;a<player.length;a++){
        Integer game= score.get(player[a]);
        if(score.get(player[a])==null){
            score.put(player[a],1);
        } else {
           score.put(player[a],++game);
        }
        }
        for (Map.Entry<Integer,Integer> run:score.entrySet()
             ) {
            System.out.println("Player:"+run.getKey()+": Repeat :"+run.getValue());
        }
        System.out.println("***********************************************************************");
        for (Integer st:score.keySet()) {
            System.out.println("Junaid :"+st+"  :Iterate :"+score.get(st));
        }


    }

    public static void main(String[] args) {
        MapHashMapMethod key=new MapHashMapMethod();
        key.junaidInfo();


    }

}
