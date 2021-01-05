package basicmidtermreview;

public enum ReviewEnum {// Main Class Body

    APPLE,ORANGE,MANGO,GRAPES,MALTA; //Attributes : Constant : Final/static public cannot be change

    public static void main(String[] args) {
       ReviewEnum sweet= ReviewEnum.APPLE;
        System.out.println(sweet);
        System.out.println(ReviewEnum.GRAPES);
        System.out.println(juice.PINNEAPPLE);
       juice good= juice.CELERY;
        System.out.println(good);
        System.out.println(akbarInfo.HASHEM);
       akbarInfo hitta= akbarInfo.JUNAID;
        System.out.println(hitta);
    }
    enum juice{ // Inside The Class Another enum
        PINNEAPPLE,CARROT,CUCUMBER,SALARY,CELERY

    }
}// Main Class Body

 enum akbarInfo{
    JUNAID,AKBAR,SHARIF,HASHEM,MAHMUD
}