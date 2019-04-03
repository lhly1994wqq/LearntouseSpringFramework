package DAO;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(String name,int age) {
        System.out.println("add User:"+name+" age:"+age);
    }
}
