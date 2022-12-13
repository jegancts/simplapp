package com.task.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "taskDtoBuildWith")

public class TaskDto {

        @Column(name="description")
        @NotEmpty(message = "Task description is mandatory")
        private String description;
        private long priority;
        @Column(name="postcode")
        @Pattern(regexp = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$",message = "Enter a valid post code")
        private String postCode;


}
