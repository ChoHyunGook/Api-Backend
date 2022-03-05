package com.bbong.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.bbong.api.member.domain
 * fileName        : CalcDTO
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
public class CalcDTO {
    private int num1;
    private int num2;
    private String op;
}
