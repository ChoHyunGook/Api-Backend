package com.bbong.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.bbong.api.member.domain
 * fileName        : GradeDTO
 * author           : chohyungook
 * date               : 2022-02-25
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-25         chohyungook        최초 생성
 */
@Data
@Component
public class GradeDTO {
    public static String GRADE_TITLE="성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

}
