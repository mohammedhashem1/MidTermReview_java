import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Important_Method_Interview {
int [] player={10,20,30,40,5,22,35,45,55,65,1,70,80,90};
// Find out the minimum value
    // How you retrieve minimum value from Array
    public void minInfo( int best[] ){
        int income=best[0];
        for( int i=0;i<best.length;i++){
            if(income>best[i]){
                income=best[i];
            }
        }
        System.out.println("The minimum value is :"+income);
    }
  //==============================================================
  //Can you Retrieve 15 Random Number
  // Find out The random number 15 ,range 50 to 300;
  public void randomInfo(){
        int [] select=new int[15];
      Random choice=new Random(50); // Confusion  Cause random value= 0 output coming where seed is 50
      for(int a=0; a<select.length;a++){
          select[a]=choice.nextInt(300);
          System.out.println(select[a]);
      }
      System.out.println(Math.random());
  }
  //================================================================================
    int [] iteration={10,35,45,55,65,35,65,55,75,10,20,90,6000,30,40,25,75,75,50,50,35,50,45,55,65};

  public void hashMapTraverse( int serial []){
      HashMap<Integer,Integer> count=new HashMap<>();
      for( int j=0;j<serial.length;j++){
         Integer repeat= count.get(serial[j]);
         if (count.get(serial[j])==null){
             count.put(serial[j],1);
         }else{
             count.put(serial[j],++repeat);
         }
      }
      for (Map.Entry<Integer,Integer> it:count.entrySet()
           ) {
          System.out.println(it.getKey()+": "+it.getValue());
      }
     int [] rupee={10,20,30,40,20,25,35,45,10,35,25,35,55,45,65,75,85,35,65,90,20,30,40,45,55,65,75,75,70,30,25,25};

      HashMap<Integer,Integer> taka=new HashMap<>();

      for(int p=0;p<rupee.length;p++){
       Integer solve=  taka.get(rupee[p]);
       if( taka.get(rupee[p])==null ){
           taka.put(rupee[p],1);
       }else{
           taka.put(rupee[p],++solve );
       }
      }
      for (Integer ab:taka.keySet()) {
          System.out.println(ab+" New: "+taka.get(ab));
      }
  }

    public static void main(String[] args) {
        Important_Method_Interview key =new Important_Method_Interview();
        key.minInfo(key.player);
        key.randomInfo();
        key.hashMapTraverse(key.iteration);

    }



}
