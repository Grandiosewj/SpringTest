package com.test;
import com.test.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String args[]) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
            Student student = context.getBean(Student.class);
            //System.out.println(student);
            //Student student2 = context.getBean(Student.class);
            //System.out.println(student2);
            //context.close();
            System.out.println(student.getClass());
            student.say("哼哼啊啊啊啊啊啊！！！！！！！");
            student.test();
        }
}
