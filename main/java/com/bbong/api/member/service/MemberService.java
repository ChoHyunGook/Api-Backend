package com.bbong.api.member.service;

import com.bbong.api.member.domain.*;

/**
 * packageName: com.bbong.api.member.service
 * fileName        : MemberService
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
public interface MemberService {

    String calc(CalcDTO calc);
    String bmi(BmiDTO bmi);


    String login(LoginDTO login);

    String grade(GradeDTO grade);

    String change(ChangeDTO change);

    String circle(CircleDTO circle);

    String week(WeekDTO week);
}
//    String memberList();
//    String memberInfo();
//    String sendList();
//    String mailSend();
//    String savingMoneyList();