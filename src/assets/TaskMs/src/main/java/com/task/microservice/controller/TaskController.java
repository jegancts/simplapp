package com.task.microservice.controller;

import com.task.microservice.dto.TaskDto;
import com.task.microservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@Validated
public class TaskController {

    @Autowired
    public TaskService taskService;

    @GetMapping(value = "/task/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getTask( @PathVariable long id) {
        return new ResponseEntity("test1",HttpStatus.OK);
    }

    @RequestMapping(value = "/{ids}", method = RequestMethod.GET)
        public ResponseEntity getTask1(@RequestParam(value="ids") String ids) {
        return new ResponseEntity("test2",HttpStatus.OK);
    }

//    @GetMapping(value = "/task",consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getTask1(@RequestParam(value="id") String id) {
//        return new ResponseEntity("test2",HttpStatus.OK);
//    }


    @PutMapping(value = "/task/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateTask(@RequestBody @Valid  TaskDto taskDto, @PathVariable long id) {
        return new ResponseEntity(taskService.updateTask(taskDto,id),HttpStatus.OK);
    }

}
