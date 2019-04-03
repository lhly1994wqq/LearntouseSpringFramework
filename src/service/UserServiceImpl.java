package service;

import DAO.UserDao;
import pojo.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.save(user.getName(),user.getAge());
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user:"+user.getName());
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("delete user:"+id);
    }
}
