package group_junaid_hashem_study;

public class SolveProblem_MahmudBai {

    /**
     * : [-30, 24, 21, -97, 92, 4147483647]
     * Largest number in array is : 2147483647
     * Smallest number in array is : -97
     */
    static int[] number = {-30, 24, 21, -97, 92, 414748647};

    public void numberInfo(int[] num) {
        int min = num[0];
        for (int a = 0; a < num.length; a++) {
            if (min > num[a]) {
                min = num[a];
                System.out.println("Minimum number is :" + min);
            }
        }
    }


    public static int maxInfo(int[] num) {
        int max = num[0];//-30
        for (int a = 0; a < num.length; a++) {
            if (num[a] > max) {
                max = num[a];
            }
        }
        System.out.println(max);
        return max;
    }

    //=================================================================================
    //=================================================================================
    int[] lotto = {100, 5000, 20, 1, 65, 9000, 34, 55, 786756453};

    public void maxLotto(int[] key) {
        int value = key[0];
        for (int a = 0; a < key.length; a++) {
            if (key[a] > value) {
                value = key[a];
            }
        }
        System.out.println("Maximum value invention :" + value);
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    int[] data = {100, 120, 110, 10, 15, 25, 35, 45, 650, 2, 340, 98, 45, 230, 980, 450, 80000, 987675678};

    public void dataInfo(int[] type) {
        int value = type[0];
        for (int j = 0; j < type.length; j++) {
            if (value > type[j]) {
                value = type[j];
            }
        }
        System.out.println("Minimum value from Data :" + value);

        System.out.println("====================Maximum as below==============================");
        for (int a = 0; a < type.length; a++) {
            if (type[a] > value) {
                value = type[a];
            }
        }
        System.out.println("Maximum value from Data :" + value);
    }

    // ==================================================================
    public void incomeLevelInfo() {
        int[] salary = {100, 190, 2000, 1500, 3500, 55500, 60000, 75000, 95000, 967897654, 10, 50, 40000, 9000};
        // Minimum value =10;
        // Maximum value=967897654;
        int income = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if (income > salary[i]) {
                income = salary[i];
            }
        }
        System.out.println("*******************************************************");

        System.out.println("The minimum salary is :" + income);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int a = 0; a < salary.length; a++) {
            if (salary[a] > income) {
                income = salary[a];
            }
        }
        System.out.println("The maximum Salary value is :" + income);
    }

    //========================================================================================
    static int[] random = {10, 1, 20, 30, 150, 190, 200, 3000, 4500, 450, 250, 300, 45, 7, 9800, 98765498};

    public int minRangeInfo(int[] num) {
        int minInfo = num[0];
        for (int j = 0; j < num.length; j++) {
            if (minInfo > num[j]) {
                minInfo = num[j];
            }
        }
        System.out.println("The random number minimum value is :" + minInfo);
        return minInfo;
    }
//=============================================================================
        public int maxRangeInfo ( int[] maxArray){
            int maxInfo = maxArray[0];
            for (int i = 0; i < maxArray.length; i++) {
                if (maxArray[i] > maxInfo) {
                    maxInfo = maxArray[i];
                }
            }
            System.out.println("The random number Maximum value is :" + maxInfo);
            return maxInfo;
        }
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        public int electionInfo () {
            int[] vote = {500, 10, 300, 200, 2, 2000, 90000, 40000, 7777777, 989898989};
            int count = vote[0];
            for(int i=0; i<vote.length;i++){
                if (count>vote[i]){
                    count=vote[i];
                }
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("The minimum vote is counted is :"+count);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            for(int j=0;j<vote.length;j++){
                if (vote[j]>count){
                    count=vote[j];
                }
            }
            System.out.println("The Maximum vote count is :"+count);
            return count;
        }

        public static void main (String[]args){
            SolveProblem_MahmudBai key = new SolveProblem_MahmudBai();
            key.numberInfo(key.number);
            SolveProblem_MahmudBai.maxInfo(number);
            key.maxLotto(key.lotto);
            key.dataInfo(key.data);
            key.incomeLevelInfo();
            System.out.println(" +++++++++++++Say Hi +++++++++++++++++++");
            key.minRangeInfo(random);
            key.maxRangeInfo(random);
            key.electionInfo();

        }

}