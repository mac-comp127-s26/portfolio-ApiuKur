
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
  
    @Test
   
    void checkname(){
    Student first=new Student("Moses", "English");
    assertEquals("Mary","Mary",first.getName());
    assertEquals(1,first.getAge());
    Student.isFood("pepper");

    }
    
}
