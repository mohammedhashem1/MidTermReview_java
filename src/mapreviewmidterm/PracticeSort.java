package mapreviewmidterm;

public class PracticeSort {
   public static  void sortInfo() {
       int[] mark = {10, 5, 20, 30, 15, 25, 40, 35, 55, 60, 70, 65, 90, 70};// ascending order
       // 5,10,15,20,25,30,35,40,.......90
       for (int i = 0; i <mark.length;i++){
          int count= mark[i];
          int j=i-1;
        while( j>=0 && mark[j]>=count) {
            mark[j+1]=mark[j];
            j=j-1;
        }
        mark[j+1]=count;
       }
       for (int a=0; a<mark.length; a++) {
           System.out.print(" " + mark[a]);
       }

       System.out.println("*******************************************************************");
    int []  number={100,20,40,10,50,60,70,10,3,5,68,44,4,33,22,11,55,66,77};
       // do sorting
       for ( int a=0;a<number.length;a++){
       int count = number[a];
       int d=a-1;
       while(d>=0 && number[d]>=count){
           number[d+1]=number[d];
           d=d-1;
       }
       number[d+1]=count;
       }
      for( int y=0; y<number.length;y++) {
          System.out.print(" "+number[y]);
      }

   }

    public static void main(String[] args) {
     PracticeSort.sortInfo();
    }
}
