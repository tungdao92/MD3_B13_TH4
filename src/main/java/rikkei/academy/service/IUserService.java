package rikkei.academy.service;

import rikkei.academy.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> selectAllUsers();
    void addUserTransaction(User user, int[] permision);
    void insertUpdateWithoutTransaction();
}