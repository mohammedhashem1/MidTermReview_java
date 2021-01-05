package mapreviewmidterm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAndHashset {

   public  static void setInfo() {
       int[] exam = {95, 85, 75, 65, 55, 45, 20, 40, 60, 90, 80};
       int[] record = {67, 55, 65, 45, 35, 90, 80, 60, 70};

       Set<Integer> key=new HashSet<>();
       key.addAll(Arrays.asList(new Integer[]{ 95, 85, 75, 65, 55, 45, 20, 40, 60, 90, 80   }));
       Set<Integer> value= new HashSet<>();
       value.addAll(Arrays.asList(new Integer[]{67, 55, 65, 45, 35, 90, 80, 60, 70 }));

       Set<Integer> obj=new HashSet<>(key);

       // addAll();  is for Union
       obj.addAll(value);
       System.out.println("Union :"+obj);

       // do the union
       // do the intersection

       Set<Integer> abc= new HashSet<>(key);
       abc.retainAll(value); // retainAll method
       System.out.println("Intersection"+abc);
       // do the difference
       Set<Integer> xyz=new HashSet<>(key);
       xyz.removeAll(value);
       System.out.println("The difference is :"+xyz);

   }

    public static void main(String[] args) {
        SetAndHashset.setInfo();
    }


}
