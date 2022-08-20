import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void fullNameCompleted(){
        Person person1 = new Person("Israel", "Martins","israel@email.com",34);

        assertEquals(person1.fullName(),person1.getLastName()+ ", " + person1.getName());

    }

    @Test
    public void isOver18(){
        Person person2 = new Person("Maria", "Moura","maria@email.com",25);
        Person person3 = new Person("João",  "Henrique", "joao@email.com", 12);

        assertEquals(true, person2.over18());
        assertFalse(person3.over18());

    }
}