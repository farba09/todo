package org.example.demotodos.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private long id;
    private String name;
    private String description;
    private boolean done;

}
