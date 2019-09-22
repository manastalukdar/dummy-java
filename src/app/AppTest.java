package app;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    App app;

    @BeforeEach
    public void setUp() throws Exception {
        app = new App();
    }

    @AfterEach
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(500), () -> {
            String[] args = new String[0];
            assertAll(() -> App.main(args));
        });
    }
}
