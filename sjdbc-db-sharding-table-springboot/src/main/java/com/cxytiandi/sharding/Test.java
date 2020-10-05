package com.cxytiandi.sharding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.addBeanFactoryPostProcessor(null);
        applicationContext.refresh();
    }
}
