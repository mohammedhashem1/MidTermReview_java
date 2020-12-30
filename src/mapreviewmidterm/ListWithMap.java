package mapreviewmidterm;

import java.util.*;

public class ListWithMap {
    public void bestInfo() {

        List<String> name = new ArrayList<>();
        name.add("Anika");
        name.add("Hashem");
        name.add("Pintu");
        name.add("Pritul");
        name.add("Rumi");

        List<String> address = new ArrayList<>();

        address.add("Queen's");
        address.add("Jamaica");
        address.add("Bronx");
        address.add("Brooklyn");
        address.add("Staten Island");

        List<String> phoneNumber = new ArrayList<>();

        phoneNumber.add("347 286 9394");
        phoneNumber.add("870 656 7000");
        phoneNumber.add("518 565 7650");
        phoneNumber.add("600 500 9000");
        phoneNumber.add("900 600 4000");

        List<String> country = new ArrayList<>();

        country.add("Bangladesh");
        country.add("India");
        country.add("Saudi Arabia");
        country.add("Afghanistan");
        country.add("Pakistan");

        List<String> profession = new ArrayList<>();

        profession.add("Doctor");
        profession.add("Engineer");
        profession.add("Architect");
        profession.add("Biologist");
        profession.add(" Scientist ");

        Map<String, List<String>> obj = new HashMap<>();
        obj.put("Student", name);
        obj.put("Address", address);
        obj.put("phoneNumber", phoneNumber);
        obj.put("Country", country);
        obj.put("Profession", profession);

        for (Map.Entry<String, List<String>> view : obj.entrySet()) {
            System.out.println("Info :" + view.getKey() + ": " + "Related Info :" + view.getValue());
        }
        for (String num : obj.keySet()) {
            System.out.println(num + "; " + obj.get(num));
        }
    }

    public static void main(String[] args) {
//        ListWithMap select = new ListWithMap();
//        select.bestInfo();
//        select.relatedInfo(winningNumber);
//        repeatInfo(size);
//        voterInfo(candidate);
        ListWithMap.stInfo(student);
        ListWithMap.randomInfo();

    }

    static int[] winningNumber = {10, 30, 20, 50, 40, 60, 70, 60, 3, 50, 40, 60, 80, 100, 70, 200, 100};

    public void relatedInfo(int[] num) {
        int result = num[0];
        for (int i = 0; i < num.length; i++) {
            if (result > num[i]) {
                result = num[i];
            }
        }
        System.out.println("The minimum number is :" + result);
        System.out.println(winningNumber[8]);
        System.out.println(winningNumber.length);
    }

    static int[] size = {10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
    };

    public static void repeatInfo(int[] iterate) {
        HashMap<Integer, Integer> best = new HashMap<>();
        for (int a = 0; a < iterate.length; a++) {
            Integer serial = best.get(iterate[a]);
            if (best.get(iterate[a]) == null) {
                best.put(iterate[a], 1);
            } else {
                best.put(iterate[a], ++serial);
            }
        }
        for (Map.Entry<Integer, Integer> select : best.entrySet()) {
            System.out.println("The Number is :" + select.getKey() + "; Iterate :" + select.getValue());
        }
    }

    static int[] candidate = {
            5, 10, 15, 17, 10, 15, 10, 5, 10, 17, 15, 20, 10, 30, 25, 30, 25, 30, 20, 35, 30, 20, 25, 40, 35, 50,
            20, 15, 20, 15, 35, 40, 10, 5, 10, 17, 15, 20, 10, 30, 25, 30, 25, 30, 20, 35, 30, 20, 25, 40, 35, 50,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            5, 10, 15, 17, 10, 15, 10, 5, 10, 17, 15, 20, 10, 30, 25, 30, 25, 30, 20, 35, 30, 20, 25, 40, 35, 50,200,
            20, 15, 20, 15, 35, 40, 10, 5, 10, 17, 15, 20, 10, 30, 25, 30, 25, 30, 20, 35, 30, 20, 25, 40, 35, 50,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
            10, 20, 20, 20, 10, 40, 20, 30, 40, 30, 20, 10, 20, 30, 30, 40, 20, 30, 20, 30, 40, 50, 50, 60, 60, 89,
    };

    public static void voterInfo(int[] election) {
        HashMap<Integer, Integer> fit = new HashMap<>();
        for (int i = 0; i < election.length; i++) {
            Integer number = fit.get(election[i]);
            if (fit.get(election[i]) == null) {
                fit.put(election[i], 1);
            } else {
                fit.put(election[i], ++number);
            }
        }
        for (Map.Entry<Integer, Integer> sl : fit.entrySet()
        ) {
            System.out.println("Number :" + sl.getKey() + " ;Iterate :" + sl.getValue());
        }
    }
   static int [] student={10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40,
            10,30,40,50,60,70,90,50,40,20,30,40,50,100,40,50,80,40
    };

    public  static void stInfo( int [] best){

        HashMap<Integer,Integer> mark=new HashMap<>();
        for (int i=0; i<best.length;i++){
           Integer exam= mark.get(best[i]);
           if (mark.get(best[i])==null){
               mark.put(best[i],1);
           }else{
              mark.put(best[i],++exam) ;
           }
        }
        for (Map.Entry key:mark.entrySet()) {
            System.out.println("Number Junaid Bai :"+key.getKey()+" :Iterate :"+key.getValue());
        }

        }
        public static void randomInfo() {
            int[] lotto = new int[8];
            Random number = new Random(40);

            for (int i = 0; i <lotto.length;i++){
                          lotto[i]  =number.nextInt(4000);
                System.out.println(lotto[i]);
            }






        }
    }



