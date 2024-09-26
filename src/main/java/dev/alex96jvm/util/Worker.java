package dev.alex96jvm.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker {
    private int id;
    private String name;
    private int salary;

}
