package basicmidtermreview;

public class DataCastingConcateNateAccessModifier {
    // Repository like  a
    //Data is a collection of facts, such as numbers, words, measurements,
    // observations or just descriptions of things.
   // What is Data?: Factual information in digital form that can be transmitted or processed basis for reasoning,
    // discussion, or calculation.  Data can be any character, including  text, numbers, sound, or video
    //
    // Casting : Converting the data type

    // Casting: Converting Data type
    // Casting is possible for only primitive to primitive data type
    // Casting is possible for only non primitive to non primitive data type

    /**
     * Data Primitive : Non primitive
     * int = 4 byte ,8* 4= 32 bit ,32*8=256 char
     * long= 8 byte , 8* 8=64 bit;
     * short = 2 byte
     * float=4 byte
     * double= 8 byte;
     * char= 2 byte;
     *byte = 1 byte
     ******* boolean =******************1 bit***************
     *NON PRIMITIVE
     * STRING
     * ARRAY
     * INTERFACE
     * CLASS
     * ENUM
     * ANNOTATION
     * 	// byte, short,long, int, float all are real number which is double type.
     * 	// byte ,short are real number which is int type.
     * 	// byte ,short, int are real number which is long type.
     */
//CASTING :
   static  long population=34000000l;
    static int newPopulation=(int) population;

  static  double citizen=newPopulation;
    static  short newCitizen=(short)citizen;


    public static void main(String[] args) {
        System.out.println(newCitizen);
        DataCastingConcateNateAccessModifier call=new DataCastingConcateNateAccessModifier();
        System.out.println(call.a/2+1);
        System.out.println(call.newQualify);
        System.out.println(call.newCorona);
        System.out.println(call.goldPrice);
        int junaidKids=34;
        DataCastingConcateNateAccessModifier.stimulus();
        stimulus();
    }
    int x=500;
     int y=x;//500;
    int z=y;
    int a=y+100;
    byte qualify=126;// 1 byte
    double newQualify=(double)qualify;//
    short corona=4000;
    double newCorona=(double) corona;
    double gold=553465.5;
    short goldPrice=(short) gold;
    int junaidKids=34;

public static void stimulus(){//
    int check=600;
    System.out.println(check);
}
    public void akbar(){
        akbar();
    }
}
