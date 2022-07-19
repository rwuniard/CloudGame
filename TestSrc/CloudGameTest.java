import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloudGameTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void jumpingOnClouds() throws Exception {
        List<Integer> c = new ArrayList<Integer>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        assertEquals(4, CloudGame.jumpingOnClouds(c));
    }
}