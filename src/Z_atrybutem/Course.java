package Z_atrybutem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    BigDecimal price;

    public static List<Course> extent = new ArrayList<>();
    public List<Results> resultsOfParticipants = new ArrayList<>();

    private void addExtent(Course d) {
        extent.add(d);
    }

    private void removeExtent(Course d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Course d: extent) {
            System.out.println(d);
        }
    }

    public Course(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        addExtent(this);
    }

    public void showPersons(){
        System.out.println("Course:");
        System.out.println(this);
        for (Results w : resultsOfParticipants) {
            System.out.println(w.person);
            System.out.println(w);
        }
    }

    public void addPerson(String ocena, LocalDate data_wystawienia, Person person){
        Results results = new Results(person,this,ocena,data_wystawienia);
        this.resultsOfParticipants.add(results);
        person.courseResults.add(results);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
