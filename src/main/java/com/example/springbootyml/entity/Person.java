package com.example.springbootyml.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
  * 将配置文件中配置的每一个属性的值，映射到这个组件中
  * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
  *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
  *
  * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
  *  @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值；
  *
  */
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
    //@Email
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String, Object> map1;
    private Map<String, Object> map2;

    private List<String> list1;
    private List<String> list2;

    private Dog dog1;
    private Dog dog2;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map1=" + map1 +
                ", map2=" + map2 +
                ", list1=" + list1 +
                ", list2=" + list2 +
                ", dog1=" + dog1 +
                ", dog2=" + dog2 +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, Object> map1) {
        this.map1 = map1;
    }

    public Map<String, Object> getMap2() {
        return map2;
    }

    public void setMap2(Map<String, Object> map2) {
        this.map2 = map2;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    public Dog getDog1() {
        return dog1;
    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }

    public Dog getDog2() {
        return dog2;
    }

    public void setDog2(Dog dog2) {
        this.dog2 = dog2;
    }
}
