package com.Project.mapstruct.Entity;


import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String department;
    private String email;
    private int age;
    private Date creationDate;


}
