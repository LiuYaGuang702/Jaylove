package A19_myjunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)   //这个注解只能在方法上使用
@Retention(RetentionPolicy.RUNTIME)  //表示这个注解能一直存在
public @interface MyTest {

}
