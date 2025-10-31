package _25_LayeredArchitecture.entity;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Todo {
    private int todoId;
    private String contents;
    private String user;
    private LocalDate createDt;
    }






