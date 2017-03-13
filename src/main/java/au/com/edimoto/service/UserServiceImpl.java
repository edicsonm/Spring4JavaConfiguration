package au.com.edimoto.service;

import au.com.edimoto.model.User;
import au.com.edimoto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by edicson on 12/3/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public List<User> listAllFamilyNames(){
        return userRepository.listAllFamilyNames();
    }

    @Override
    public User listUser(String firstName, String lastName) {
        return userRepository.listUser(firstName, lastName);
    }
}
