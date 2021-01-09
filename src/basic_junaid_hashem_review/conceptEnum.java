package basic_junaid_hashem_review;

import jdk.swing.interop.SwingInterOpUtils;

public enum conceptEnum {
   HASHEM,AKBAR,JUNAID,ANIKA,BASHER,KHAIR,PINTU;
    // Enum is like a class
    // Enum has  attributes what is like data type ; Constant
    // enum attributes  should be capital letter
    // Enum works like a group
    // all constant or attributes should be public static final cannot be changeable
    // Enum can be create inside the class and outside of the class , definitely not inside the method
    // all class enum  work lise a static method
    //Attributes : Constant : Final/static public cannot be change
    // ENUM CANNOT TAKE DUPLICATE ATTRIBUTES
    // ENUM LIKE A CLASS BUT STATIC ,ABLE TO CALL DIRECTLY IN THE MAIN METHOD

   public static void main(String[]arge){
       System.out.println(conceptEnum.HASHEM);

   }
   public enum colorInfo{
       RED,WHITE,PURPLE,GREEN,LEMON,PINK;

       public static void main(String[] args) {
           System.out.println("The best color is :"+RED);
           colorInfo best=colorInfo.WHITE;
          studentNameInfo good= studentNameInfo.NASIM;
           System.out.println(good);
           System.out.println("The choicest color is :"+colorInfo.PINK);
           System.out.println(best);
       }

    }
   public enum studentNameInfo{
       NASIM,MAHMUD,TITU,PINTU,HASHEM,AKBAR
   }

}
