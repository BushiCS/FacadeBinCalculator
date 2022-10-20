import org.example.BinOps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinOpsTest {
    private final BinOps binOps = new BinOps();

    @Test
    @DisplayName("Тест бинарного сложения")
    void binSumTest() {
        Assertions.assertEquals("10010", binOps.sum("101", "1101"));
    }

    @Test
    @DisplayName("Тест бинарного умножения")
    void binMultTest() {
        Assertions.assertEquals("10110", binOps.mult("10", "1011"));
    }
}
