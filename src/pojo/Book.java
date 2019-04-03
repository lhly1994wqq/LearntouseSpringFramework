package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Component("b")
public class Book {
    private int id;
    private String name;
    @Resource(name = "u",type = User.class)
    private User user;

////    Constructor
//    @Autowired
//    public Book(User user){
//        this.user = user;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void init(){
        System.out.println("创建了一本书");
    }

    public void destroy(){
        System.out.println("销毁了一本书");
    }
}
