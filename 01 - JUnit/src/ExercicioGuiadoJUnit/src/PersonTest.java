import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<Person> collection = new ArrayList<>();

    @BeforeEach
    void doBefore(){
        p1 = new Person("Ivo", "Ganda", LocalDate.of(2016, 3, 23));
        collection.add(p1);
        p2 = new Person("Ana", "Musk", LocalDate.of(1966, 1, 3));
        collection.add(p2);
        p3 = new Person("Joe", "Castro", LocalDate.of(2010, 12, 4));
        collection.add(p3);
        p4 = new Person("Rob", "Morelo", LocalDate.of(1976, 12, 4));
        collection.add(p4);
        p5 = new Person("Ted", "Assunção", LocalDate.of(2014, 10, 25));
        collection.add(p5);
        p6 = new Person("Robert", "Batista", LocalDate.of(2000, 5, 15));
        collection.add(p6);
        p7 = new Person("Renata", "Moura", LocalDate.of(2010, 3, 30));
        collection.add(p7);
        p8 = new Person("Murilo", "Felipe", LocalDate.of(2015, 7, 18));
        collection.add(p8);
        p9 = new Person("Candido", "Moreira", LocalDate.of(1975, 9, 11));
        collection.add(p9);
        p10 = new Person("Camila", "Aguiar", LocalDate.of(2014, 5, 25));
        collection.add(p10);
    }

   @Test
   void addNamesTest(){
       List<String> collection2 = p10.addNames(collection);
       assertEquals(2, collection2.size());
   }

   @Test
    void calculateAgeTest(){
        int ageLess18 = p10.calculateAge();
        int ageLess18P = p3.calculateAge();
        int ageOver18 = p4.calculateAge();
        int ageOver18P = p2.calculateAge();

        assertEquals(8,ageLess18);
        assertEquals(45,ageOver18);
        assertTrue(ageLess18P<18);
        assertTrue(ageOver18P>18);
    }
}