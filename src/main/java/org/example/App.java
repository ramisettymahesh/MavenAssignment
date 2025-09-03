package org.example;

import com.name.Names;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Names name=(Names)context.getBean("myName");
        System.out.println(name.name);

    }
}
