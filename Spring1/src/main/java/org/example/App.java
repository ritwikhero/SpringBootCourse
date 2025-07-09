package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien a1 = (Alien) context.getBean("alien1");
//        a1.setAge(21);
//        a1.code();
        System.out.println(a1.getAge());
        a1.code();
//        System.out.println(a1.getSalary());


//        Alien a2 = (Alien) context.getBean("alien1");
//        a2.code();
//        System.out.println(a2.age);
    }
}
