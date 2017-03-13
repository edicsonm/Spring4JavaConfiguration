package au.com.edimoto.service;

import au.com.edimoto.model.User;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.List;

/**
 * Created by edicson on 12/3/17.
 */
public interface UserService {
    List<User> listAllUsers();
    List<User> listAllFamilyNames();
    User listUser(String firstName, String lastName);
}
