import static org.junit.Assert.*;
import org.junit.*;

public class demoFileTest {
    
    @Test
   public void greaterThanFiveTest() {
      assertEquals("Greater than 5.", demoFile.greaterThanFive(-17));
    }
    
}
