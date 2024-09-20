import org.example.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    public static void factTest(){
        Main main = new Main();
        //Test factorial
        assertEquals(main.fac(5), 120);
        assertEquals(main.fac(0), 1);
        assertEquals(main.fac(1), 1);
    }


}
