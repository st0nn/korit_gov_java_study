package _27_Generic;

import lombok.Data;
/*
* @Data => Getter Setter toString RequiredArgs 다 들어욌는 언옵테이션
* */
@Data
public class ResponseData<T> {
    private T message;
    private T data1;
    private T data2;
    private T data3;


    public String toStringStr() {
        return T message+ T data1;
    }
    public String toStringInt() {
        return message+data2;
    }
    public String toStringDouble() {
        return message+data3;
    }


}
