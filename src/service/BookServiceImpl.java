package service;

import DAO.BookDao;
import pojo.Book;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void addBook(Book book) {
        bookDao.save(book.getName());
    }

    @Override
    public void whoIsUser(Book book) {
        System.out.println("the user is "+book.getUser().getName());
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
