package au.com.edimoto.repository;

import au.com.edimoto.model.User;

import java.util.List;

/**
 * Created by edicson on 12/3/17.
 */
public interface UserRepositoryOperations {
    User findBySSO(String userName);
    void saveUser(User user);
    List<User> listAllFamilyNames();
    User listUser(String firstName, String lastName);
}
