package basic_junaid_hashem_review;

public class StringConcept {

    String country; // Data Type plus String Is Class too cause String word start with capital letter
    String city="Manhattan , New York ";//  global variable / reference/instance variable
   static  String name="Joe Biden"; // class variable

    public static void main(String[] args) {
        String teacher="Mahmud Bai";// Local variable
        StringConcept poll=new StringConcept();
        poll.country="Saudi Arabia";
        System.out.println(poll.country.toUpperCase());
        System.out.println(poll.country.toLowerCase());
        System.out.println(poll.city.trim());
        System.out.println(poll.country.isEmpty());
        //System.out.println(poll.country.toLowerCase());
        System.out.println(poll.country.indexOf(3));
        System.out.println(poll.country.substring(3));
        System.out.println(name.substring(1,5));
        System.out.println(poll.city.replace('j','D'));
        System.out.println(name.equals("Junaid"));
        System.out.println(name.equals("Joe Biden"));
        System.out.println(teacher.equals("Mahmud Bai"));
        System.out.println(teacher.isEmpty());
        //System.out.println(teacher.contains());
        System.out.println(teacher.concat(" "+"Shahib"));
        System.out.println(poll.country.concat(" "+" Mecca"));
        System.out.println(poll.city.length());
        System.out.println(teacher.compareToIgnoreCase("mahmud bai "));
        System.out.println(teacher.toLowerCase());

    }

}
