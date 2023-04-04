package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData {

    private String username;
    private int age;

    // 롬복 @Getter @Setter 어노테이션 사용하면 직접 getter, setter 만들어주지 않아도 됨.
}
