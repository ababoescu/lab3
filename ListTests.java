import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter(){
        ArrayList<String> input1 = new ArrayList<>();
            input1.add("Ab");
            input1.add("Bc");
            input1.add("Cd");
        assertEquals({"Ab","Bc","Cd"}, input1.filter())
        

    }
}
