package com.canon.spring.base.replaced.annotation;

import org.springframework.beans.factory.xml.BeanDefinitionDocumentReader;

import java.lang.annotation.*;

/**
 * @PackageName: com.canon.spring.base.replaced.annotation
 * @Description:
 * @author: canon
 * @date: 2020/9/16 17:17
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReplacedMethod {

    /**
     * old method name
     * can not be null
     * @return
     */
    String name();


    /**
     * replace bean name
     * this bean must implments MethodReplacer
     * @see {@link org.springframework.beans.factory.support.MethodReplacer}
     * @return
     */
    String replacer();

    /**
     * argType
     * @return
     */
    String[] argType() default {};

}
