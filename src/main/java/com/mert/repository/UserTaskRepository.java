package com.mert.repository;

/**
 * Created by Souelmi Aymen
 */
import com.mert.model.Task;
import com.mert.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mert.model.UserTask;

import java.util.List;

@Repository("userTaskRepository")
public interface UserTaskRepository extends JpaRepository<UserTask, Integer> {
    List<UserTask> findByTask (Task task);
    List<UserTask> findByUser (User user);
}
