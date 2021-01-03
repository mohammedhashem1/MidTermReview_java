package mapreviewmidterm;

public class Group_12_31_2020 {

   int [] best= new int[7] ;  // Array declare
     static String [][] city=new String[3][3];// 2D Declare


    public static void main(String[] args) {
        Group_12_31_2020 key=new Group_12_31_2020();
        key.best [0]=12;
        key.best [1]=22;
        key.best [2]=32;
        key.best [3]=42;
        key.best [4]=52;
        key.best [5]=62;
        key.best [6]=72;

        System.out.println(key.best[3]);
        System.out.println(key.best[6]);
        for(int a=0;a<key.best.length;a++) {
            System.out.println("The best winning number is :" + key.best[a]);
        }

        Group_12_31_2020.city[0][0]="X";
        Group_12_31_2020.city[0][1]="Y";
        Group_12_31_2020.city[0][2]="Z";


        Group_12_31_2020.city[1][0]="A";
        Group_12_31_2020.city[1][1]="B";
        Group_12_31_2020.city[1][2]="C";

        Group_12_31_2020.city[2][0]="P";
        Group_12_31_2020.city[2][1]="Q";
        Group_12_31_2020.city[2][2]="R";

        System.out.println(Group_12_31_2020.city[1][1]);
        for (String[] ab:Group_12_31_2020.city) {
            for (String a:ab) {
                System.out.println("Number :"+a);
            }
        }

    }

}
