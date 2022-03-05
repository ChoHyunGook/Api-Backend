package com.bbong.api.member.service;

import com.bbong.api.member.domain.*;
import com.bbong.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.bbong.api.member.service
 * fileName        : MemberServiceImpl
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberRepository repository;


    @Override
    public String calc(CalcDTO calc) {
        int res=0;
        switch (calc.getOp()){
            case "+": res=calc.getNum1()+calc.getNum2();break;
            case "-": res=calc.getNum1()-calc.getNum2();break;
            case "*": res=calc.getNum1()*calc.getNum2();break;
            case "/": res=calc.getNum1()/calc.getNum2();break;
            case "%": res=calc.getNum1()%calc.getNum2();break;
        }
        return String.format("%d %s %d = %d",calc.getNum1(),calc.getOp(),calc.getNum2(),res);
    }

    @Override
    public String bmi(BmiDTO bmi) {
        double res= bmi.getWeight() / (bmi.getInch()* bmi.getInch()) *10000;
        String result;

        if(res<=18){
            result="저체중";
        }
        else if(res<=22.9) {
            result="정상";
        }
        else if(res<=23) {
            result="과체중";
        }else if(res<=24.9) {
            result="위험체중";
        }else if(res<=29.9) {
            result="1단계 비만";
        }else if(res<=34.9) {
            result="2단계 비만";
        }
        else {
            result="고도비만";
        }
        return String.format("%s님\n BMI지수: %3f \n 결과: %s"
                ,bmi.getName(),res,result);

    }

    @Override
    public String login(LoginDTO login) {
        return String.format("고객이름:%s \n ID:%s \n PASSWORD:%s ",login.getName(),login.getId(),login.getPw());
    }

    @Override
    public String grade(GradeDTO grade) {
        int total = grade.getKor()+grade.getEng()+grade.getMath();
        int avg= total/3;
        String pass=(avg>=60) ? "합격":"불합격";

        String gr = String.format(" * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                GradeDTO.GRADE_TITLE,grade.getName(),grade.getKor(),grade.getEng(),grade.getMath(),total,avg,pass);

        return gr;
    }

    @Override
    public String change(ChangeDTO change) {
        int res= change.getInput()-change.getCoffee();
        return String.format("거스름돈은 %d입니다.",res);
    }

    @Override
    public String circle(CircleDTO circle) {
        double res=circle.getPi()*circle.getHalf()*circle.getHalf();
        return String.format("원주율: %.3f \n 반지름: %.1f\n 원넓이: %.3f",circle.getPi(),circle.getHalf(),res);
    }

    @Override
    public String week(WeekDTO week) {
        int res= week.getHour()* week.getSalary();
        int res1= res* week.getDay();
        return String.format("%s님\n 일급: %d\n 주급: %d",week.getName(),res,res1);
    }


}
