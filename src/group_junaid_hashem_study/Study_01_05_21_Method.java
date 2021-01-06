package group_junaid_hashem_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Study_01_05_21_Method {
   // minimum value find out by method
   int [] player={70,90,50,80,3,25,65,1};
   int [] mark={34,22,33,44,66,99,77,11,7};
    // find out: 1, find out minimum value
    public void playerInfo( int [] best){
        int rank= best[0];
        for (int i = 0; i <best.length ; i++) {
            if(rank>best[i]) {
                rank=best [i];
            }
        }
        System.out.println("Minimum number :"+ rank );
    }

    public void mangoInfo() {
        int[] mango = {100, 50, 20, 10, 50, 90, 30, 20, 30, 10, 3};
        int juice =mango[0];//100
       for(int a=0;a<mango.length;a++) {
           if(juice>mango[a]){
               juice=mango[a];
           }
       }
        System.out.println(" Junaid ate  Mango :"+juice);
    }
    public void pakInfo(){
        double [] goldPrice={400.5, 500, 600,700.75,900.75,2.75};
        double price=goldPrice[0];
        for(int j=0; j<goldPrice.length;j++){
            if(price>goldPrice[j]){
                price=goldPrice[j];
            }
        }
        System.out.println("The minimum goldPrice is :" +price);
    }
    public static void tvInfo(){
        double [] sony={4000.75,3000.50,1000,500.50,20.25,10.10};
        double goodPrice=sony[0];
        System.out.println("High Price "+goodPrice);// 4000.75 cause array[0];
        for( int k=0; k<sony.length; k++ ){
            if(goodPrice>sony[k]){
                goodPrice=sony[k];
            }
            System.out.println("TV good price :"+goodPrice);
        }

    }
    //=======================================================================================
    //Random Number
  static  int [] baby=new int[6]; // How many Value it will execute randomly
    Random yearly=new Random(5);// Starting point
    public  void babyInfo(){
        for(int i=0; i<baby.length;i++){
            baby[i]=yearly.nextInt(20);// Ending Point
            System.out.println(" Baby Age is :"+baby[i]);
        }
        System.out.println(Math.random());
    }

    //====================================================================
    // single dimension array
    // Random Class and random method
    double [] price=new double[5];// Execute 5 values
    Random good=new Random(50);// seed
    public void priceInfo(){
        for(int k=0; k<price.length;k++){
                           price[k]= good.nextInt(300);//end point
            System.out.println("Price is :"+price[k]);
        }
    }
//==================================================================================================
    int [] students={90,40,50,50,30,40,50,60,70,90,80,10,10,20,20,30,40,30,20,20,80,
            90,40,50,50,30,40,50,60,70,90,80,10,10,20,20,30,40,30,20,20,80,
            90,40,50,50,30,40,50,60,70,90,80,10,10,20,20,30,40,30,20,20,80,
            90,40,50,50,30,40,50,60,70,90,80,10,10,20,20,30,40,30,20,20,80
    };

   // Each Individual Number how many times iterate , Means 90 like 6 times, or 70 like 3;
public void studentInfo( int [] junaid){
    HashMap<Integer,Integer> best=new HashMap<>();
    for (int i=0; i<junaid.length;i++ ){
         Integer exam=best.get(junaid[i]);// best is object ;  . relationship ; get () is default method; inside get
        // method call arrays by arrayName [i]; then everything put in one another object which is exam
        if (best.get(junaid[i])==null ){
            best.put(junaid[i],1);
        } else{
            best.put(junaid[i],++exam);
        }
    }
    for (Map.Entry<Integer,Integer> akbar:best.entrySet()) {
        System.out.println(akbar.getKey()+" :"+akbar.getValue());
    }

}
//=========================================================================================================
//=========================================================================================================
    public void hashMapTraverseInfo(){
    int [] price={
            50,60,65,75,60,80,90,51,65,66,90,74,10,12,30,33,80,90,40,20,
            50,60,65,75,60,80,90,51,65,66,90,74,10,12,30,33,80,90,40,20,
            50,60,65,75,60,80,90,51,65,66,90,74,10,12,30,33,80,90,40,20,
            50,60,65,75,60,80,90,51,65,66,90,74,10,12,30,33,80,90,40,20
    };

    HashMap<Integer,Integer> goldRate=new HashMap<>();// Object Create

    for (int a=0;a<price.length;a++){
        Integer value=goldRate.get(price[a]);// goldRate object; get is default method
        if (goldRate.get(price[a])==null){
            goldRate.put(price[a],1);
        } else{
            goldRate.put(price[a],++value);
        }
    }
        for (Map.Entry<Integer,Integer> gp:goldRate.entrySet()
             ) {
            System.out.println(gp.getKey()+" :"+gp.getValue());
        }
    }


    public static void main(String[] args) {
        Study_01_05_21_Method key= new Study_01_05_21_Method();
        key.playerInfo(key.player);
        key.mangoInfo();
        key.playerInfo(key.mark);
        key.pakInfo();
        Study_01_05_21_Method.tvInfo();
        System.out.println("******************************************************");
        key.babyInfo();
        key.priceInfo();
        key.studentInfo(key.students);
        System.out.println("************************************************************");
        key.hashMapTraverseInfo();
    }

}
