package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", // 시작지점 지장 여기서 부터 찾아라~
//        basePackageClasses = AutoAppConfig.class, //여기서 부터 찾음
        //위에 이런 지정 방식 사용하지 않고 최상단ㅇ[ 두는게 관례
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
