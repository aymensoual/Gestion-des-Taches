package com.mert.repository;

/**
 * Created by Souelmi Aymen
 */
import com.mert.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mert.model.User;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByEmail(String email);
	List<User> findByRole(Role role);
}
