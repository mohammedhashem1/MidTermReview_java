package basic_junaid_hashem_review;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        ControlFlow.LearnControlFlow();
        ControlFlow push = new ControlFlow();
        // push.JunaidMarriedInfo();
        ControlFlow.nestedBlock();
    }

    public static void LearnControlFlow() { //Noun or Verb should be ;
        int apple = 10;
        if (apple == 6) { // Parenthesis showing the conditions, if the condition true then will execute
            System.out.println("True");
        } else if (apple >= 15) {
            System.out.println("Never");
        } else if (apple > 15) {
            System.out.println("Excellent");
        } else if (apple < 15) {
            System.out.println("So So");
        } else if (apple <= 15) {
            System.out.println("Acceptable");
        } else if (apple != 15) {
            System.out.println("Yeh");
        } else {
            System.out.println("False");
        }
        System.out.println("****************************************************************");
        Scanner pop = new Scanner(System.in);
        int age = pop.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting in USA");
        } else {
            System.out.println("Person not eligible for vote in USA");
        }
        pop.close();

    }

    // public void JunaidMarriedInfo() {
//     Scanner pull = new Scanner(System.in);
//     //double goldPrice=pull.nextDouble();// Scanner Class
//     double goldPrice = pull.nextDouble();
//     if (goldPrice >= 15000.5) {
//         System.out.println("Junaid able  to marry second time");
//     } else {
//         System.out.println("Junaid crying ");
//     }
//     pull.close();
//
// }
    public static void nestedBlock() {
        int JunaidIncome = 100000;
        int AkbarIncome = 90000;
        if (JunaidIncome > AkbarIncome) {
            System.out.println("Junaid has good job");
            double junaidExpese = 84500.5;
            double akbarExpense = 89000.5;
            if (junaidExpese < akbarExpense) {
                System.out.println("Akbar  is too much expense");

                int junaidSaving = 5000;
                int akbarSaving = 4000;
                if (junaidSaving > akbarSaving) {
                    System.out.println("Junaid can save more money");
                } else {
                    System.out.println("Akbar has less saving");// 1 st block condition
                }

            } else {
                System.out.println("Junaid can save money");//2nd Block condition
            }

        } else {
            System.out.println("Not True");//For  1st condition
        }
    }

}
