package _24_Builder.StaticMember;

//staticMember라는 클래스
public class StaticMember {
    //staticMember 클래스 필드값
    private String name;
    private int age;
    private String email;


    //빌더 클래스(내부 클래스)
    public static class Builder {
        //빌더클래스 필드값
        private String name;
        private int age;
        private String email;

        //내부 함수
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public StaticMember build() {
            return new StaticMember(this);
        }
    }

    // 생성자인데 빌더클래스 객체를 반환받음.
    private StaticMember(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

}