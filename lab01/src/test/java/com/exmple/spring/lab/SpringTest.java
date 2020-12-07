package com.exmple.spring.lab;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/7
 */
public class SpringTest {
    @Test
    public void testContextNotNullPositive() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        assertNotNull("spring container should not be null", ctx);
        System.out.println("Spring was bootstrapped for environment " + ctx.getEnvironment());
        ctx.close();
    }
}
