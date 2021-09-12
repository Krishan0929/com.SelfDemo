package com.SelfDemo.Model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class course
{
    @Id
    @Column(name = "course_id")
    private int id;

    private String name;
}
