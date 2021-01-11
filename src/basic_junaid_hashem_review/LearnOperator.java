package basic_junaid_hashem_review;

public class LearnOperator {
    /**
     * Assignment: =
     * Arthmetic: additive; subtractive,multiplication ,division,modulas;remainder
     * conditional:|| and &&
     * equatity And relational:
     * Urirary: increment or decrement ;
     * post increment ,pre increment
     * post decrement; pre decrement
     */
    public static void main(String[] args) {
        LearnOperator.LearnArthmeticOperator();
        LearnOperator.learnAssignmentOperator();
        LearnOperator.LearnEqulityAndRelationshipOperator();
    }

    public static void LearnArthmeticOperator() {
        int x = 15;
        int y = 20;
        int price = x + y;
        System.out.println("Additive operator is :" + price);
        int value = price - 2;
        System.out.println("Subtractive operator :" + value);
        int multipleValue = value * 4;
        System.out.println("MultipleOperator :" + multipleValue);
        int divisionValue = multipleValue / 2;
        System.out.println("Division value is :" + divisionValue);
        int remainderValue = divisionValue / 5;
        System.out.println("Remainder/ modulus operator is :" + remainderValue);
    }

    public static void learnAssignmentOperator() {
        //=
        //=
        //=
        int junaid = 10;
        junaid = 80;
        junaid = 120;
        int akbar;
        akbar = junaid;
        System.out.println("Swap the value :" + junaid);// 10,10 =====120 , Java takes the latest value
        System.out.println("Swap the value :" + akbar); //120

        double price = 30;
        int cost = 90;
        price = cost;
        //cost=price;
        System.out.println(price);

        long population = 990000000l;
        short citizen = 1000;
        // citizen=population;
        population = citizen;
        System.out.println(citizen);
        int mark = 90;
        double pass = 72.5;
        pass = mark;
        System.out.println("swapping value of pass:" + pass);//90
        int goodPass = (int) pass;//90
        System.out.println(goodPass);
        System.out.println(goodPass);// 72
    }

    public static void LearnEqulityAndRelationshipOperator() {
        //int a==34;  Equility and Relational operator is working only the conditonal  related like in controlFlow and for loop
// < , > , <= ,>=,!=, ==
        double x = 7.5;
        int y = 5;
        if (y < x) {
            System.out.println("Junaid hungry");
        }
        if (x == y) {
            System.out.println("Akbar left");
        } else {
            System.out.println("Akbar mother in law sick");
        }
        if (x > y) {
            System.out.println("Great ");
        }
     if (x !=y){
         System.out.println("Not correct");
     }
     if(x>=y){
         System.out.println("True");
     }
     if(x<=y){
         System.out.println("Not true ");
     }
     if (x<y){
         System.out.println("Excellent");
     }
     int a=5;
     int b=3;
     for(int i=0;i<a;i++){
         System.out.println("Joe Biden");
     }
     while(b>0){
         System.out.println("Not true ");
         b--;
     }
     do {
         System.out.println("Practice need more ");
         a--;
     }while(a>0);

    }

}
