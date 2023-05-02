package HomeWork5.service;

import java.util.List;

import HomeWork5.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);

     List<User> getUserList();
}
