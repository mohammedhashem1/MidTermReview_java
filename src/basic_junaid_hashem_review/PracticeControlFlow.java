package basic_junaid_hashem_review;

public class PracticeControlFlow {

    public static void main(String[] args) {
        int student = 50;
        if (student == 70) {
            System.out.println("The statement is ni=ot true ");
        } else if (student > 50) {
            System.out.println(" The statement is not correct ");
        } else if (student <= 49) {
            System.out.println("The statement is not correct");
        } else if (student > 50) {
            System.out.println("The statement is not true");
        } else if (student <= 40) {
            System.out.println("Not correct");
        } else if (student == 50) {
            System.out.println("Excellent Result and True");
        } else {
            System.out.println("The student is fifty");
        }
        //============================================================
        examInfo();
        gradeFlow();
        PracticeControlFlow push=new PracticeControlFlow();
        push.NestedIfElse();
    }

    //===============================================================================================
    int mark = 5;
    static String pass;

    public static void examInfo() {
        PracticeControlFlow poll = new PracticeControlFlow();
        switch (poll.mark) {
            case 1:
                pass = "Very Bad Performance";
                break;
            case 2:
                pass = "Need to practice";
                break;
            case 3:
                pass = "Performance not Good";
                break;
            case 4:
                pass = "Almost reach at the level";
                break;
            case 5:
                pass = " Excellent Performance";
                break;
            case 6:
                pass = "Mark is not satisfactory";
                break;
            case 7:
                pass = "Student performance not good";
            case 8:
                pass = "Not attend at the exam";
            default:
                pass = "Do or Die";
                System.out.println("Performance  is :" + pass);
                break;
        }
        System.out.println("The Performance is :" + pass);
    }

    //=============================================================================================
    int grade = 7;
    String exam;

    public static void gradeFlow() {
        PracticeControlFlow pop = new PracticeControlFlow();
        switch (pop.grade) {
            case 1:
                pop.exam = "1 st Year Exam";
                break;
            case 2:
                pop.exam = "2nd Year Exam";
                break;
            case 3:
                pop.exam = " 3rd year Exam";
                break;
            case 4:
                pop.exam = "4Th year exam";
                break;
            case 5:
                pop.exam = "5th year exam";
                break;
            case 6:
                pop.exam = "6 th year exam";
                break;
            case 7:
                pop.exam = "Best Performance of whole year";
                break;
            case 8:
                pop.exam = "Exam is suspended for corona";
                break;
            default:
                pop.exam = "Not Matching";
                System.out.println("Life time best achievement is :" + pop.exam);
                break;
        }
        System.out.println("Life time best achievement is :" + pop.exam);
    }
public void NestedIfElse() {
    int applePrice = 40;
    int orangePrice = 50;
    if ( applePrice<orangePrice){
        System.out.println("Apple price is affordable range");
        double appleJuice=2.50;
        double orangeJuice=3.25;
        if(orangeJuice>appleJuice){
            System.out.println("Orange Juice price is too high");
            double appVitamin=1.45;
            double orangeVitamin=2.25;
            if (orangeVitamin>applePrice){
                System.out.println("Orange has more vitamin than apple");
            }else{
                System.out.println("Apple has less vitamin than orange ");
            }
        }else{
            System.out.println("Apple Juice price is less than orange Juice");
        }
    }else{
        System.out.println("Apple price is not affordable");
    }

}

}
