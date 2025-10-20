package _12_Array;

public class Array02
{
    static void main(String[] args) {

        //배열 순회
        String[] countries = {"한국","일본", "중국","태국", "러시아"};
        for (int i = 0; i < 5; i++) {
            System.out.println(countries[i]);
        }
        for (String country : countries) {
            System.out.println(country);
        }

        //내가 좋아하는 음식 1번
        String myFavFood [] = {"일식", "한식", "중식", "베트남음식"};
        int num = 1;
        for (String printFood : myFavFood){
            System.out.println("내가 좋아하는 음식 "+num+"번 "+printFood);
            num ++;
        }
    }
}
