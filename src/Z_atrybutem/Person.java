package Z_atrybutem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int semester;
    public static List<Person> extent = new ArrayList<>();
    public List<Results> courseResults = new ArrayList<>();

    private void addExtent(Person d) {
        extent.add(d);
    }

    private void removeExtent(Person d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Person d: extent) {
            System.out.println(d);
        }
    }

    public Person(String imie, int semestr) {
        this.name = imie;
        this.semester = semestr;
        addExtent(this);
    }

    public void addCourse(String ocena, LocalDate data_wystawienia, Course course){
        Results results = new Results(this, course,ocena,data_wystawienia);
        this.courseResults.add(results);
        course.resultsOfParticipants.add(results);
    }

    public void showResults(){
        System.out.println("Person:");
        System.out.println(this);
        for (Results results : courseResults) {
            System.out.println(results.course);
            System.out.println(results);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }
}
