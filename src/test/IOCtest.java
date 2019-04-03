package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;
import pojo.User;
import service.BookService;
import service.UserService;

public class IOCtest {

    @Test
    public void test1(){
        String contextfile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextfile);
        //BookService bs = (BookService)context.getBean("bookService");
        Book b = (Book)context.getBean("book");
        System.out.println(b.getUser());
    }

    @Test
    public void test2(){
        String contextfile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextfile);
        User u = (User)context.getBean("user");
        UserService us = (UserService)context.getBean("userService");
       // us.addUser(u);
    }
}
