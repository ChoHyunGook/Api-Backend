package com.bbong.api.member.repository;

import com.bbong.api.member.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.bbong.api.member.repository
 * fileName        : MemberRepository
 * author           : chohyungook
 * date               : 2022-02-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-25         chohyungook        최초 생성
 */

public interface MemberRepository {

    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String login(LoginDTO login);

    String grade(GradeDTO grade);

    String change(ChangeDTO change);

    String circle(CircleDTO circle);


    String week(WeekDTO week);
}
