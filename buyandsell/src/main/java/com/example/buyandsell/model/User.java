package com.example.buyandsell.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString

@Document("user")
public class User {

    @Id
    String Id;
    String name;
    String email;
    String password;
   }
