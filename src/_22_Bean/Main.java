package _22_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setAge(12);
        userEntity.setUsername("남영석");
        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUsername("남영석");
        userEntityLombok.setAge(12);
        userEntityLombok.setEmail("st0nn@Naver.com");
        userEntityLombok.setUserId(000301);
        System.out.println(userEntityLombok);
    }


}
