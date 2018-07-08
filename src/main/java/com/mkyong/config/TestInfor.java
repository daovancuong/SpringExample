package com.mkyong.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestInfor {
    public String name() default "dao van cuong";

    public String lastModified() default "today";

    public String note() default "nothing";
}
