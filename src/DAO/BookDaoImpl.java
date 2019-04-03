package DAO;

public class BookDaoImpl implements BookDao {

    @Override
    public void save(String name) {
        System.out.println("add book:"+name);
    }
}
