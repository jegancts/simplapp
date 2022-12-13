package com.task.microservice.service;

import com.task.microservice.dto.TaskDto;
import com.task.microservice.exceptions.TaskNotFoundException;
import com.task.microservice.model.Task;
import com.task.microservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class TaskImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task updateTask(TaskDto taskDto, long id) {
         Optional<Task> task = taskRepository.findById(id);
        if(!task.isEmpty()) {

            Task taskUpdate = task.get();
            taskUpdate.setDescription(taskDto.getDescription());
            taskUpdate.setPriority(taskDto.getPriority());
            taskUpdate.setPostCode(taskDto.getPostCode());
            return taskRepository.save(taskUpdate);
        } else {
            throw new TaskNotFoundException("Task not found");
        }

    }
}
