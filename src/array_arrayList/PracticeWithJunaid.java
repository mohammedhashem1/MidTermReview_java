package array_arrayList;

import java.util.*;
import java.util.List;

public class PracticeWithJunaid {
static int [] selected={ 100,70,90,80,60,70,50,60,70,90,4,50,80,90,1,55};
//Find out //Execute minimum value from array
    public void minInfo(int [] min){
        int value=min[0];
        for(int a=0;a<min.length;a++){
            if(value>min[a]){
                value=min[a];
            }
        }
        System.out.println("The minimum value is :"+value);
        int [] select=new int[15];// array size
        Random number=new Random(50);// starting point
        for(int a=0;a<select.length;a++){
            select[a]=number.nextInt(10000);// end point
            System.out.println(select[a]);
        }
        double [] price=new double[12];
        Random junaid=new Random(25);
        for (int k=0; k<price.length;k++){
            price[k]=junaid.nextInt(2300);
            System.out.println(price[k]);
        }
        System.out.println(Math.random());
     //=============================================================================
     int [] takeFive=new int[10]; //  Array size 10;
     Random lottery=new Random(60); // Seed means starting point from 60;
     for (int a=0; a<takeFive.length;a++){
         takeFive[a]=lottery.nextInt(600);// End point 600;
         System.out.println(takeFive[a]);
     }
        System.out.println(Math.random());
     //==================================================================
     int [] serial= new int[9];
     Random ticket=new Random(25);
     for(int i=0; i<serial.length;i++){
         serial[i]=ticket.nextInt(1000);
         System.out.println("Best Number is :"+serial[i]);
     }
        System.out.println(Math.random());
     //=========================================================================
        int player[]= new int[11];
        Random football=new Random(75);
        for(int i=0;i<player.length;i++){
            player[i]=football.nextInt(700);
            System.out.println("Random number is :"+player[i]);
        }
        System.out.println(Math.random());
    }
    //===================================================================
   static  int [] kids={10,15,20,90,80,50,30,50,40,50,60,20,40,30,450,3,45,67,86,54};

    public void smallestValue(int school[]){
        int apply=school[0];
        for(int s=0; s<school.length;s++){
            if(apply>school[s]){
                apply=school[s];
            }
            System.out.println("the smallest value is :"+apply);
        }
    }
    public void overAll(){
        int [] mega=new int[12];
        Random ball=new Random(90);
        for(int p=0;p<mega.length;p++){
            mega[p]=ball.nextInt();
           System.out.println(mega[p]);
        }
        System.out.println(Math.random());

    }
static int [] members={10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
        10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
        10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
        10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
        10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
        10,20,10,25,56,37,37,56,70,90,60,50,75,55,65,4,35,45,35,45,90,55,45,35,40,40,70,60,50,40,50,60,
};
public static  void hashMapInfo(int []traverse){
    HashMap<Integer,Integer> hash=new HashMap<>();
    for( int i=0; i<traverse.length;i++){
      Integer  increment= hash.get(traverse[i]);
      if(hash.get(traverse[i])==null){
          hash.put(traverse[i],1);
      } else{
          hash.put(traverse[i],++increment);
      }
    }
    for (Map.Entry<Integer,Integer> info:hash.entrySet()) {
        System.out.println("The numerical number is :"+info.getKey()+": iterate is :"+info.getValue());
    }
}
//===============================================
 List<Integer> winningNumber=new LinkedList<>();
public static  void winningInfo(){
    PracticeWithJunaid mega=new PracticeWithJunaid();
    mega.winningNumber.add(43);
    mega.winningNumber.add(56);
    mega.winningNumber.add(57);
    mega.winningNumber.add(70);

    System.out.println(mega.winningNumber.get(2));
    for (Integer lk: mega.winningNumber)  // DataType + objectName: MEGA ObjectName +Array
          {
              System.out.println(lk);
    }

}



    public static void main(String[] args) {
        PracticeWithJunaid key=new PracticeWithJunaid();
        key.minInfo(selected);
        key.smallestValue(kids);
        key.overAll();
        PracticeWithJunaid.hashMapInfo(members);
        PracticeWithJunaid.winningInfo();
    }





}
