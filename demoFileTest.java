import static org.junit.Assert.*;
import org.junit.*;

public class demoFileTest {
    
    @Test
   public void greaterThanFiveTest() {
      assertEquals("Less than or equal to 5.", demoFile.greaterThanFive(-17));
    }
    // 
    
}
