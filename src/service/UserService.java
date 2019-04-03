package service;

import pojo.User;

public interface UserService{
    public  void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
}