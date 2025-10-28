package _22_Bean;

/*
* Bean
* 필드 속성들을 프로퍼티라고 하며, 해당 프로퍼티들은 private 로 캡슐화가 되어있어야 한다.
* 그리고 캡슐화된 프로퍼티들은 getter, setter로만 접근 가능하다.
* getter setter들은 모두 다 public이어야 한다.
* 빈은 데이터를 표현하는 것을 목적으로 둠.
* */

import java.time.LocalDateTime;

public class UserEntity {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(userID=" + userId + ", username=" + username +  ", userAge=";
    }
}
