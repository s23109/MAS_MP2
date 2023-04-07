package Z_atrybutem;

import java.time.LocalDate;


public class Results {

    public Person person;
    public Course course;

    public String grade;
    public LocalDate date;

    public Results(Person person, Course course, String grade, LocalDate date) {
        this.person = person;
        this.course = course;
        this.grade = grade;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Results{" +
                "grade='" + grade + '\'' +
                ", date=" + date +
                '}';
    }
}
