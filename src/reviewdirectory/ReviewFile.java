package reviewdirectory;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReviewFile {


    public static void main(String[] args) {
        String filePath = "../MidTermReview_Java/ReviewDirectory/review.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String book;
            while ((book = bufferedReader.readLine()) != null) {
                System.out.println(book);
            }
        } catch (Exception e) {
            System.out.println("File is not found");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File is permanently close");
            }
        }

    }


}
