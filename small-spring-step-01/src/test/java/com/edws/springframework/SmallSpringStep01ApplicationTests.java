package com.edws.springframework;

import org.junit.jupiter.api.Test;

class SmallSpringStep01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testBeanFactory() {
        // 创建工厂和bean定义对象
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        // 注册bean到工厂中
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }

}
