package array_arrayList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashSetReview {
// Stack lifo
        // Queue Fifo
     static Set<Integer> pass=new HashSet<Integer>();
    public void setInfo(){
        pass.add(90);
        pass.add(80);
        pass.add(70);
        pass.add(60);
        pass.add(50);
        System.out.println( pass.size());
        System.out.println(pass.contains(60));
        System.out.println(pass.toString());
       // System.out.println(pass.toArray());
        System.out.println("************************************************");
        //pass.removeAll(pass);
        for (Integer st:pass) {
            System.out.println(" ^^^^^"+st);
        }
     Set<String> name=new TreeSet<>() ;
        name.add("Joe Biden");
        name.add("Akbar the Great");
        name.add("Ertugul Gazi");
        System.out.println(name.contains("Joe Biden"));

    }

    public static void main(String[] args) {
        SetHashSetReview drunk=new SetHashSetReview();
        drunk.setInfo();

    }


}
