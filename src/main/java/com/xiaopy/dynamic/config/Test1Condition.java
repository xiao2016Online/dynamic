package com.xiaopy.dynamic.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author xiaopeiyu
 * @since 2020/4/4
 */
public class Test1Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String custom = conditionContext.getEnvironment().getProperty("custom");
        System.out.println("======="+custom);
        return true;
    }
}
