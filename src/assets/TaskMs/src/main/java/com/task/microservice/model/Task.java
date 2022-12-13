package com.task.microservice.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "taskBuildWith")
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="description")
    @NotEmpty(message = "Task description is mandatory")
    private String description;
    @Column(name="priority")
    private long priority;

    @Column(name="postcode")
    @Pattern(regexp = "^(?:[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2})$",message = "Enter a valid post code")
    private String postCode;


}
