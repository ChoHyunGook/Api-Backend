package com.bbong.api.member.repository;

import com.bbong.api.member.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * packageName: com.bbong.api.member.repository
 * fileName        : MemberServiceImpl
 * author           : chohyungook
 * date               : 2022-02-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-25         chohyungook        최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(BmiDTO bmi) {
        return null;
    }

    @Override
    public String login(LoginDTO login) {
        return null;
    }

    @Override
    public String grade(GradeDTO grade) {
        return null;
    }

    @Override
    public String change(ChangeDTO change) {
        return null;
    }

    @Override
    public String circle(CircleDTO circle) {
        return null;
    }


    @Override
    public String week(WeekDTO week) {
        return null;
    }
}
