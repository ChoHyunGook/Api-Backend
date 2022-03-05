package com.bbong.api.member.controller;

import com.bbong.api.member.domain.*;
import com.bbong.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.bbong.api.member.controller
 * fileName        : MemberController
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/bmi")
    public String getBmi(@RequestBody BmiDTO bmi){
        return service.bmi(bmi);
    }
    @PostMapping("/calc")
    public String getClac(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("/login")
    public String getLogin(@RequestBody LoginDTO login){
        return service.login(login);
    }
    @PostMapping("/grade")
    public String getGrade(@RequestBody GradeDTO grade){
        return service.grade(grade);
    }
    @PostMapping("/change")
    public String getChange(@RequestBody ChangeDTO change){
        return service.change(change);
    }
    @PostMapping("/circle")
    public String getCircle(@RequestBody CircleDTO circle){
        return service.circle(circle);
    }
    @PostMapping("/week")
    public String getWeek(@RequestBody WeekDTO week){
        return service.week(week);
    }

}
