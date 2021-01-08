package basic_junaid_hashem_review;

public class SingletonConcept {

    String party = "Birth Day";
    int guests = 78;
    boolean isCakeGood = true;
    private String name = "Ahmed";
    private String bankInfo = "Secret";
    private int contact = 3486976;

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public SingletonConcept() {// Default Constructor
    }

    private SingletonConcept(String fName, String bank, String birth, int people) { // Multi parameterized
        // constructor
        String person = this.name = fName;
        String Dollar = this.bankInfo = bank;
        String anniversary = this.party = birth;
        int invite = this.guests = people;
        System.out.println(person + ";" + Dollar + ";" + anniversary + ";" + invite);
    }

    public void singleInfo(String name1, String bankInfo1, int contact1) { // parametrized method
        System.out.println(name1 + ";"+bankInfo1 +";"+ contact1);
    }

    public String getParty(String fN, String lN) {
        String fullName = fN +" "+ lN;
        return fullName;
    }

    public void setParty(String nickName) {
        this.name= nickName;
    }
    public  String getBankInfo(){
    return bankInfo;
    }
    public void setBankInfo(String amount){
        this.bankInfo=amount;
    }

    public boolean isCakeGood() {
        return isCakeGood;
    }

    public void setCakeGood(boolean cakeGood) {
        isCakeGood = cakeGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // =========================================SingleTon======================================================
    private static SingletonConcept reference=new SingletonConcept();
    public static SingletonConcept getReference(){
        return reference;
    }

    public static void main(String[] args) {
        SingletonConcept pop=new SingletonConcept("Hashem" ,"Citi " , "January 1976", 65);

    }
}
