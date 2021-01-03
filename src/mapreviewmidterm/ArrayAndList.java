package mapreviewmidterm;

import java.util.*;

public class ArrayAndList {


    List<String> name = new ArrayList<String>();
    List<String> city = new ArrayList<String>();
    List<String> country = new ArrayList<String>();
    List<String> profession = new ArrayList<String>();
    List<String> salary = new ArrayList<String>();
//    ARRAYLIST
//    The java ArrayList implements List Interface
//    ArrayList always maintain insertion order of the elements
//    ArrayList only stores value or element
//    ArrayList can contain duplicate elements
//    We can have any numbers of null elements in ArrayList
//    ArrayList get() method always gives an O(1) performance

         static List<Boolean> isTrue=new ArrayList<>();

    public  static void booleanInfo(){
     ArrayAndList.isTrue.add(false);
     ArrayAndList.isTrue.add(true);
     ArrayAndList.isTrue.add(true);
     ArrayAndList.isTrue.add(true);
     ArrayAndList.isTrue.add(true);
     ArrayAndList.isTrue.add(true);
     ArrayAndList.isTrue.add(true);
        System.out.println(ArrayAndList.isTrue);
    }


    public static void stInfo() {
        ArrayAndList call = new ArrayAndList();

        call.name.add("Junaid");
        call.name.add("Akbar");
        call.name.add("Sharif");
        //===================================================
        call.city.add("Lahore");
        call.city.add("Deanga");
        call.city.add("Dhaka");
        //===================================================
        call.country.add("Pakistan");
        call.country.add("USA");
        call.country.add("Bangladesh");
        //=============================================
        call.profession.add("Self Service");
        call.profession.add("Uber");
        call.profession.add("Engineer");
        //==============================
        call.salary.add("76555654");
        call.salary.add("8975565");
        call.salary.add("879900877");

        Map<String, List<String>> info = new HashMap<>();

        info.put("Best Student :", call.name);
        info.put("City :", call.city);
        info.put("Country :", call.country);
        info.put("Profession :", call.profession);
        info.put("Salary :", call.salary);

        for (Map.Entry<String, List<String>> Hitta : info.entrySet()) {
            System.out.println("View" + Hitta.getKey() + ": Related Info :" + Hitta.getValue());
        }
        System.out.println("****************************************************************");

        for (String select : info.keySet()) {
            System.out.println(select + " :" + info.get(select));
        }
    }

    public static void methodInfo(int[] min) {
        int value = min[0];
        for (int i = 0; i < min.length; i++) {
            if (value > min[i]) {
                value = min[i];
            }
        }
        System.out.println("The minimum value is :" + value);
    }

    public static void main(String[] args) {
        booleanInfo();

        int[] number = {10, 15, 20, 10, 50, 35, 55, 45, 25, 25, 7, 3, 1, 20, 30, 40, 20, 30, 40, 10, 20, 30, 30, 25, 35, 29, 45, 55, 50, 100, 75};
        methodInfo(number);
        ArrayAndList.stInfo();

        HashMap<Integer, Integer> recall = new HashMap();
        for (int a = 0; a < number.length; a++) {
            Integer name = recall.get(number[a]);
            if ((recall.get(number[a])) == null) {
                recall.put(number[a], 1);
            } else {
                recall.put(number[a], ++name);
            }
        }
        for (Map.Entry<Integer, Integer> call : recall.entrySet()
        ) {
            System.out.println(" Number : " + call.getKey() + "; " + call.getValue());
        }
        //================================================================================================
        //===============================================================================================
        //===============================================================================================
        int[] random = {10, 20, 5, 30, 35, 55, 30, 20, 90, 80, 60, 70, 50, 40, 50, 60, 60, 70, 30, 40, 20, 20, 30, 40, 40, 10, 30, 20};
        HashMap<Integer, Integer> call = new HashMap<>();
        for (int i = 0; i < random.length; i++) {
            Integer choice = call.get(random[i]);
            if (call.get(random[i]) == null) {
                call.put(random[i], 1);
            } else {
                call.put(random[i], ++choice);
            }
        }
        for (Map.Entry<Integer, Integer> select : call.entrySet()) {
            System.out.println("The ***Number*** Is :" + select.getKey() + ";" + select.getValue());
        }

        //==============================================================================================
        int[] winningNumber = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120, 130, 140, 150};
        int[] lotto = {20, 40, 60, 80, 100, 120, 140, 160};

        Set<Integer> win = new HashSet<>();
        win.addAll(Arrays.asList(new Integer[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120, 130, 140, 150}));

        Set<Integer> serial = new HashSet<>();
        serial.addAll(Arrays.asList(new Integer[]{23, 22, 69, 87, 100, 120, 140, 160}));


        // UNION
        Set<Integer> obj = new HashSet<>(win);
        obj.addAll(serial);
        System.out.println(obj);

        // INTERSECTION

        Set<Integer> obj1 = new HashSet<>(win);
        obj1.retainAll(serial);
        System.out.println(obj1);

        // Difference
        Set<Integer> obj2 = new HashSet<>(win);
        obj2.containsAll(serial);
        System.out.println(obj2);

        obj2.removeAll(serial);
        System.out.println(obj2);
        int[] roll = {10, 15, 25, 35, 45, 55, 45, 35, 25, 35, 15, 10, 15, 40, 30, 25, 35, 55, 20, 35, 25, 30, 55, 60, 65};
        HashMap<Integer, Integer> best = new HashMap<>();
        for (int i = 0; i < roll.length; i++) {
            Integer result = best.get(roll[i]);
            if ((best.get(roll[i])) == null) {
                best.put(roll[i], 1);
            } else {
                best.put(roll[i], ++result);
            }
        }
        for (Map.Entry<Integer, Integer> exam : best.entrySet()) {
            System.out.println("The Number is :" + exam.getKey() + ": Iteration is :" + exam.getValue());
        }
        int[] player = new int[10];
        Random good = new Random(40);
        for (int i = 0; i < player.length; i++) {
            player[i] = good.nextInt(600);//Range 40-600;
            System.out.println(player[i]);
        }
        System.out.println(Math.random());
        System.out.println("*****************************************************");
        ticketInfo();
        System.out.println("******************************************");
        ArrayAndList.randomInfo();
    }

    //===================================================================================
    static int[] ticket = new int[15];
    static Random select = new Random(60);

    public static void ticketInfo() {
        for (int c = 0; c < ticket.length; c++) {
            ticket[c] = select.nextInt(700);
            System.out.println(ticket[c]);
        }
        System.out.println(Math.random());
        Queue<String> best = new ArrayDeque<>();

        best.add("Pintu");
        best.add("Saudi");
        best.add("Madina");
        best.add("pakistan");
        best.add("Bangladesh");
        System.out.println(best.poll());
        System.out.println(best.poll());
        System.out.println(best.poll());
        System.out.println(best.poll());
        //System.out.println(best.poll());
        System.out.println(best.peek());
        System.out.println(best.poll());
    }

    static int[] service = new int[10];
    static Random patient = new Random(5);

    public static void randomInfo() {

        for (int b = 0; b < service.length; b++) {
            service[b] = patient.nextInt(100);
            System.out.println(service[b]);
        }


    }
}
