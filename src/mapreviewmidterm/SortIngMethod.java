package mapreviewmidterm;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortIngMethod {

    public void sortInfo() {
        int[] num = {10, 20, 15, 5, 30, 40, 35, 50, 45, 60, 55, 80, 70, 90, 80, 110, 100, 140, 110, 120, 150};
        // output: 5 10 15 20 30 35 40 45 50 55 60 70 80 80 90 100 110 110 120 140 150

        for (int i = 0; i < num.length; i++) {
            int j = i - 1; // -1   0  1
            int point = num[i]; // 10  20  15


            while (j >= 0 && num[j] > point) {
                num[j + 1] = num[j];  //20
                //num[2] = num[j];
                j = j - 1; //0
            }
            num[j + 1] = point;
            // num[0]=point;
        }

        for (int n = 0; n < num.length; n++) {
            System.out.print(num[n] + " ");
        }
        System.out.println("*****************************************************");

        int [] student={89,65,34,23,45,89,90,77,66,55,22,11,11};
        // output: 11,11,22,23,34,45,55,65,66,77,89,90
        for ( int i=0; i<student.length;i++){
           int j= student[i];
           int k=i-1;
           while ( k>=0 && student[k]>=j){
               student[k+1]=student[k];
               k=k-1;
           }
           student[k+1]=j;
        }
        for(int a=0;a<student.length;a++){
            System.out.println("Print :"+student[a]);
        }
        System.out.println("****************************************");
        int [] mark={ 10,2,1,44,33,66,77,44,33,22,10};
        for ( int a=0;a<mark.length;a++){
           int subject= mark[a];
           int book=a-1;
           while(book>=0 && mark[book]>=subject){
               mark[book+1]=mark[book];
               book=book -1;
           }
           mark[book+1]=subject;
        }
        for (int i=0; i< mark.length;i++)
        {
            System.out.println(mark[i]);
        }
        System.out.println("*****************************************");
int [] books={10,34,2,13,44,10,11,44,33,22,1,9,14,24,34,44,50};
        for( int i=0; i<books.length;i++){
           int study= books[i];
           int read=i-1;
           while(read>=0 && books[read]>=study){
               books[read+1]=books[read];
               read=read-1;
           }
           books[read+1]=study;
        }
for (int i=0;i<books.length;i++){
    System.out.println(books[i]);
}

int [] cricket={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
int [] player={ 20,40,60,80,100,120,140,160};
        Set< Integer> best=new HashSet<>();
        best.addAll(Arrays.asList(new Integer []{ 10,20,30,40,50,60,70,80,90,100,110,120,130,140,150}));
        Set<Integer> national= new HashSet<>();
        national.addAll(Arrays.asList(new Integer[]{20,40,60,80,100,120,140,160 }));
// Union
        Set< Integer> call=new HashSet<>(best);
        call.addAll(national);
        System.out.println("Union :"+call);
// Intersection:
call.retainAll(national);
        System.out.println("Intersection :"+call);
        // difference
        call.removeAll(national);
        System.out.println(call);

    }

    public static void main(String[] args) {
        SortIngMethod call=new SortIngMethod();
        call.sortInfo();
    }
}
