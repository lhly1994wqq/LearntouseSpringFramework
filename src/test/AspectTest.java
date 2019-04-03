package test;

import Factory.MyBeanFactory;
import Factory.ProductLogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;
import pojo.User;
import service.BookService;
import service.ProductService;
import service.UserService;

public class AspectTest {
    @Test
    public void test1(){

        String xmlPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserService us = (UserService)context.getBean("userService");
        User u =(User) context.getBean("user");
        us.addUser(u);
    }

    @Test
    public void test2(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        BookService bs = (BookService)context.getBean("bookService");
        Book book = (Book)context.getBean("book");
        bs.whoIsUser(book);
    }

    @Test
    public void test3(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        ProductService ps = (ProductService)context.getBean("productServiceId");
        ps.addProduct();
        ps.deleteProduct();
        ps.updateProduct();
    }
}
