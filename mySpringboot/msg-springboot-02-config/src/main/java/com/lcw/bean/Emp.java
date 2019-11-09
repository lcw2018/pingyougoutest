package com.lcw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/8/4
 */

@PropertySource(value = {"classpath:emp.properties"})
@Component
@ConfigurationProperties(prefix = "emp")//注意，emp必须是小写
@Valid
public class Emp {
    /**
     * 类似于 Spring 中的 xml 配制文件中的数据注入方式：
     * <bean class="Emp">
     * <property name="lastName" value="字面量/ #{SpEL}Spring表达式/ ${key}从
     * 配制文件取值">
     * </property>
     * </bean>
     */
    // @Value("${emp.lastName}")
    @Email
    private String lastName;

    //  @Value("#{10*2}")
    private Integer age;

    //   @Value("20000")
    private Double salary;


    private boolean boss;


    private Date birthday;


    private Map map;


    private List list;

    //爱好
    private Forte forte;


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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }
}
