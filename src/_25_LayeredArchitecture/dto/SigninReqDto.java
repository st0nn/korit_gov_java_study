package _25_LayeredArchitecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//모든 요소 받는 생성자
@AllArgsConstructor
//정보 출력
@Getter
//정보 수정
@Setter
//정보 열변한
@ToString


//회원가입 DTO
public class SigninReqDto {
    //유저 이름
    private String username;
    //패스워드
    private String password;
}
