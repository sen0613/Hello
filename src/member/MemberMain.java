package member;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberMain {
    public static void main(String[] args) {

        Member list1 = new Member();
        list1.setName("김세원");
        list1.setAge(27);
        list1.setHpnum("010-4734-6373");
        list1.setEmail("sewon0613@naver.com");

        Member list2 = new Member();
        list2.setName("류승아");
        list2.setAge(25);
        list2.setHpnum("010-9377-6928");
        list2.setEmail("loveyou_06@naver.com");

        Member list3 = new Member();
        list3.setName("김태준");
        list3.setAge(27);
        list3.setHpnum("010-6256-7334");
        list3.setEmail("kim19911211@gmail.com");

        Member list4 = new Member();
        list4.setName("임준성");
        list4.setAge(20);
        list4.setHpnum("010-9972-8210");
        list4.setEmail("wnstjd9972@gmail.com");

        Member list5 = new Member();
        list5.setName("이진석");
        list5.setAge(26);
        list5.setHpnum("010-2979-0767");
        list5.setEmail("jins920409@gmail.com");

        Member list6 = new Member();
        list6.setName("이가원");
        list6.setAge(25);
        list6.setHpnum("010-6439-5943");
        list6.setEmail("dlrkdnjs1211@gmail.com");

        Member list7 = new Member();
        list7.setName("류관리");
        list7.setAge(26);
        list7.setHpnum("010-2478-1378");
        list7.setEmail("sona.ria.sss@gmail.com");

        Member list8 = new Member();
        list8.setName("이기봉");
        list8.setAge(26);
        list8.setHpnum("010-3009-5732");
        list8.setEmail("lkb573@gmail.com");

//        Member list9 = new Member();
//        list9.setName("이진석");
//        list9.setAge(26);
//        list9.setHpnum("01029790767");
//        list9.setEmail("jins920409@gmail.com");
//
//        Member list10 = new Member();
//        list10.setName("이진석");
//        list10.setAge(26);
//        list10.setHpnum("01029790767");
//        list10.setEmail("jins920409@gmail.com");
//
//        Member list11 = new Member();
//        list11.setName("이진석");
//        list11.setAge(26);
//        list11.setHpnum("01029790767");
//        list11.setEmail("jins920409@gmail.com");



        List<Member> list = Arrays.asList(
                list1, list2, list3, list4,
                list5, list6, list7, list8
        );

        MemberService service = new MemberService();

        double average = service.calcAverageAge(list);  //1번 호출

        System.out.printf("팀원 나이의 평균은 %.2f 입니다. \n", (double) average);


        String lastName = "이";
        int numberOfSameLastNamedPeople = service.howManyMembersWithLastName(list, lastName);

        System.out.printf("같은 성을 가진 사람의 수는  %d 입니다. \n", numberOfSameLastNamedPeople);


        double result = service.calcAverageIdChar(list);
        System.out.println(result);


    }
}
