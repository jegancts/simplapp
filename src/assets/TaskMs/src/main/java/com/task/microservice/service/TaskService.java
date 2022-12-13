package com.task.microservice.service;

import com.task.microservice.dto.TaskDto;
import com.task.microservice.model.Task;

public interface TaskService {

    Task updateTask(TaskDto taskDto , long id);
}
