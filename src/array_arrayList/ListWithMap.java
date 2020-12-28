package array_arrayList;

import java.util.*;
import java.util.List;

public class ListWithMap {
    public void overAllinfo() {
        List<String> st = new LinkedList<>();
        st.add("Junaid");
        st.add("Khalid");
        st.add("Akbar");
        st.add("Muneer");
        st.add("Hashem");

        List<String> address = new LinkedList<>();
        address.add("Manhattan");
        address.add("Uptown");
        address.add("Uptown");
        address.add("Long Island");
        address.add("Jamaica");

        List<String> cityInfo = new LinkedList<>();
        cityInfo.add("Pakistan");
        cityInfo.add("Rawalpndi");
        cityInfo.add("Lahore");
        cityInfo.add("Long Island");
        cityInfo.add("Dhaka");

        List<String> phoneNumber = new LinkedList<>();
        phoneNumber.add("718 219 8817");
        phoneNumber.add("347 286 9394");
        phoneNumber.add("987 345 675");
        phoneNumber.add("312 355 5656");
        phoneNumber.add("555 111 8888");

        Map<String, List<String>> senario = new HashMap<>();
        senario.put("Student_name :", st);
        senario.put("Address :", address);
        senario.put("City Info :", cityInfo);
        senario.put("Phone Number :", phoneNumber);

        for (Map.Entry<String, List<String>> result : senario.entrySet()) {
            System.out.println(result.getKey() + "; " + result.getValue());
        }
    }

    public void overAllInfo() {

        List<String> studentName = new ArrayList<>();
        studentName.add("Alamin");
        studentName.add("Basher");
        studentName.add("Hashem");
        studentName.add("Rahim");
        studentName.add("Karim");

        List<String> stFather = new ArrayList<>();

        stFather.add("Mohammed Ismail");
        stFather.add("Mohammed Khaleque");
        stFather.add("Mohammed Khair");
        stFather.add("Mohammed Hashem");
        stFather.add("Mohammed Basher");

        List<String> cityInfo = new ArrayList<>();

        cityInfo.add("Bikrampur");
        cityInfo.add("Commilla");
        cityInfo.add("Dhaka");
        cityInfo.add("Jamaica");
        cityInfo.add("Village");

        List<String> countryInfo = new ArrayList<>();
        countryInfo.add("Bangladesh");
        countryInfo.add("India");
        countryInfo.add("Pakistan");
        countryInfo.add("Srilanka");
        countryInfo.add("Nepal");


    }


    public static void main(String[] args) {
        ListWithMap call = new ListWithMap();
        call.overAllinfo();
    }

}
