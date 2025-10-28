package _22_Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString

public class UserEntityLombok {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

    //Lombok은 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
    //코드 다이어트를 위함
    //getter setter toString 생성자 Builder
}
