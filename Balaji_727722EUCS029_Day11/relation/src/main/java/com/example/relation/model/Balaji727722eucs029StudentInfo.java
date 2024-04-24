package com.example.relation.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Balaji727722eucs029StudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}
