package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SemanticVersioningTest {

    @Test
    @DisplayName("バージョン1.4.2が戻る")
    public void _should_return_1_4_2() throws Exception {
        // Setup
        SemanticVersioning sut = new SemanticVersioning(1, 4, 2);

        // Exercise
        String actual = sut.toString();

        // Verify
        assertEquals("1.4.2", actual);
    }

    @Test
    @DisplayName("バージョン2.1.0が戻る")
    public void _should_return_2_1_0() throws Exception {
        // Setup
        SemanticVersioning sut = new SemanticVersioning(2, 1, 0);

        // Exercise
        String actual = sut.toString();

        // Verify
        assertEquals("2.1.0", actual);
    }

    @Test
    @DisplayName("等価性 1.4.2と2.1.0が等価ではない")
    public void _should_equality_valid() throws Exception {
        // Setup
        SemanticVersioning sut = new SemanticVersioning(1, 4, 2);
        SemanticVersioning another = new SemanticVersioning(2, 1, 0);

        // Verify
        boolean actual = sut.equals(another);
        assertFalse(actual);
    }


}
