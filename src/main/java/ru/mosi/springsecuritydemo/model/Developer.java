package ru.mosi.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data             // создает геттеры и сеттеры
@AllArgsConstructor      // это конструктор для всех аргументов
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
