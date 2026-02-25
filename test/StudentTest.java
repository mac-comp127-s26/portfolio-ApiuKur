
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
  
    @Test
   
    void checkname(){
    Student first=new Student("Moses", "English");
    System.out.println(first.eat());
    assertEquals("Mary","Mary",first.getName());
    assertEquals(1,first.getAge());
    Student.isFood("pepper");
    Student.countStudents();
    int expected=2;
    int actual=Student.countStudents();
     assertEquals(expected,actual);
     
     

    }
  
    
}
