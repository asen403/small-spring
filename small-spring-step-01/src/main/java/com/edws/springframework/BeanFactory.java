package com.edws.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author whs
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition bean){
        beanDefinitionMap.put(name, bean);
    }

}
