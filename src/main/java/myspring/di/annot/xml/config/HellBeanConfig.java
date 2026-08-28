package myspring.di.annot.xml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 설정 클래스 어노테이션, 다른 클래스보다 먼저 로드됨
@Configuration

// <context:component-scan base-package="myspring.di.annot">
@ComponentScan(basePackages = {"myspring.di.annot.xml"})

// <context:property-placeholder location="classpath:values.properties" />
@PropertySource(value = "classpath:values.properties")

public class HellBeanConfig {

}
