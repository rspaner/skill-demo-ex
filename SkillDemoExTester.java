import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoExTester {
    @Test
    public void subtraction() {
        int difference = SkillDemoEx.subtract(3,4);
        assertEquals(-1, difference);
    } 
}
