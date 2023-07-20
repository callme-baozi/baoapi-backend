package com.baozi.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验
 *
 */
@Target(ElementType.METHOD) //  用于指定注解的作用目标，表示该注解只能用于方法上。这意味着，只有在方法上使用该注解才会生效，否则编译器会报错。
@Retention(RetentionPolicy.RUNTIME) // 用于指定注解的存储策略，表示该注解在运行时仍然保留。这意味着，在程序运行时，可以通过反射机制获取到使用了该注解的方法，并对其进行相应的处理。
// 如果不指定该注解的存储策略，默认为 RetentionPolicy.CLASS，表示该注解只在编译时存在，不会被编译器写入到 class 文件中，也无法在程序运行时获取到。
public @interface AuthCheck {

    /**
     * 有任何一个角色
     *
     * @return
     */
    String[] anyRole() default "";


    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";

}

