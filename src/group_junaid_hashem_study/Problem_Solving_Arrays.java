package group_junaid_hashem_study;

public class Problem_Solving_Arrays {
int [] select= new int[]{23,33,66,980,450,790,9999,88888,989840000,89675,1,656,70000};
public void selectInfo(int [] basic){
    int number=basic[0];
    for(int a=0;a<basic.length;a++){
        if (number>basic[a]){
            number=basic[a];
        }
    }
    System.out.println("Select Minimum number is :"+number);
    System.out.println("**************Hi Akbar bai*****************");
    for (int j=0;j<basic.length;j++){
        if(basic[j]>number){
            number=basic[j];
        }
    }
    System.out.println("Select Maximum number is :"+number);
}

    public static void main(String[] args) {
        Problem_Solving_Arrays key =new Problem_Solving_Arrays();
        key.selectInfo(key.select);
    }

}
