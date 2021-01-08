package basic_junaid_hashem_review;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonConcept pop=new SingletonConcept();
        pop.singleInfo("Hashem" ,"Citi Bank",900800);
      SingletonConcept push=  SingletonConcept.getReference();
      push.setBankInfo("Chase");
        System.out.println(push.getBankInfo());
        push.setCakeGood(false);
        System.out.println(push.isCakeGood());
        push.setParty("Khalid");
        System.out.println(push.getParty("Junaid","Khalid, Lahore"));
        push.setName("Arham Hussain, Long Island ,PNT");
        System.out.println(push.getName());
        push.setContact(987659);
        System.out.println(push.getContact());

    }
}
