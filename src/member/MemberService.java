package member;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {

    //1
    public double calcAverageAge(List<Member> list) {

        int sumOfAge = 0;
        for (Member e : list) { // Member 클래스에서 가져왔기 때문에 형식은 'Member'
            sumOfAge += e.getAge();
        }
        //출력
        double result = (double) sumOfAge / list.size();
        return result;
    }



    //2
    public int howManyMembersWithLastName(List<Member> list, String lastName) {

        int numberOfSameLastNamedPeople = 0;


        for (Member e : list) { // Member 클래스에서 가져왔기 때문에 형식은 'Member'
            if(e.getName().contains(lastName)) {
                numberOfSameLastNamedPeople++;
            }

        }
        return numberOfSameLastNamedPeople;
    }



    //3
    public double calcAverageIdChar(List<Member> list) {


        List<String> idOfEmail = new ArrayList<>();

        for (Member e : list) {
            idOfEmail.add(e.getEmail().substring(0, e.getEmail().indexOf("@"))); // 첫 번째부터 @까지 substring(0,e.getEmail().indexOf("@"))
        }

        int wordTotalCount = 0;
        for (String e : idOfEmail) {
            wordTotalCount += e.length();
        }


        return (double)wordTotalCount/idOfEmail.size();



    }

}
