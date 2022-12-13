package com.task.microservice.repository;

import com.task.microservice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    @Override
    <S extends Task> S save(S s);

    Task save(Optional<Task> taskGet);
}
