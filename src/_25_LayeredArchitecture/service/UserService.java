package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userlist) {
        this.userList = userList;
    }

    public boolean isDuplicatedUsername(String string){
        return true;
    }

//    public User findByUserName(String username) {
//        for(User user : users) {
//            if(user.getUsername().equals(username)) {
//                return userList.findByUsername(username) != null;
//            }
//        }
//    }
}
