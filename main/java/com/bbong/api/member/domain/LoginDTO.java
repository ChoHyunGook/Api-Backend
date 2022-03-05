package com.bbong.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.bbong.api.member.domain
 * fileName        : LoginDTO
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
public class LoginDTO {
    private String id;
    private String pw;
    private String name;
}
