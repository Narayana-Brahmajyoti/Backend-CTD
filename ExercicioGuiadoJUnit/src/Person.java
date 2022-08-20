import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String lastName;
    private LocalDate birthDate;

    public Person(String name, String lastName, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge(){
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public int nameSize(){
        return this.name.length();
    }

    public List<String> addNames(List<Person> person){
        List<String> collection = new ArrayList<>();

        for(int i = 0; i < person.size(); i++){
            int nameSize = person.get(i).nameSize();
            int age = person.get(i).calculateAge();

            if(nameSize > 4 && age > 17) {
                collection.add(person.get(i).getName());
            }
        }
        return collection;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
