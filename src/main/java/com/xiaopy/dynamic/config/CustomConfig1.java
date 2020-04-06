package com.xiaopy.dynamic.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaopeiyu
 * @since 2020/4/4
 */
@Configuration
//@Conditional(Test1Condition.class)
@ConditionalOnExpression("'${custom}'.equals('public')")
public class CustomConfig1 {

    @Bean
    public String getUrl(){
        return "/xiaopy1";
    }

}
