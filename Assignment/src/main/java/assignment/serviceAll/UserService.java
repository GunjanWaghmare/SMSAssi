package assignment.serviceAll;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.entity.User;
import assignment.repository.UserRepository;

@Service
public class UserService {

	 private final UserRepository userRepository;

	    @Autowired
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public List<User> findUsersByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

	    public String updateUser(Integer id, User updatedUser) {
	        Optional<User> optionalUser = userRepository.findById(id);
	        
	        if (optionalUser.isPresent()) {
	            User existingUser = optionalUser.get();
	            existingUser.setUsername(updatedUser.getUsername());

	            userRepository.save(existingUser);
	            return "User updated successfully";
	        } else {
	            return "User not found";
	        }
	    }
	}