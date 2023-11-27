package ru.aurakhov.myrestspringbootapph2db.entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
@Table(name = "DISCIPLINES")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "point")
    private int point;


    public Discipline(String name, String teacher, String faculty, int point) {
        this.name = name;
        this.teacher = teacher;
        this.faculty = faculty;
        this.point = point;
    }
}
