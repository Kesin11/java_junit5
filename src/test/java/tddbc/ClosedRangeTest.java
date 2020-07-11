package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ClosedRangeTest {
    public ClosedRange closedRange;

    @BeforeEach
    public void setUp() {
        closedRange = new ClosedRange(3, 5);
    }

    @Nested
    class constructor {
        @Test
        @DisplayName("Constructor")
        public void _constructor() {
            assertEquals(3, closedRange.lower);
            assertEquals(5, closedRange.higher);
        }
    }

    @Nested
    class include {
        @Test
        @DisplayName("Include point inside range should return true")
        public void _include_point_inside_range() {
            assertEquals(true, closedRange.include(4));
        }
        @Test
        @DisplayName("Include point inside range should return false")
        public void _include_point_outside_range() {
            assertEquals(false, closedRange.include(10));
        }

        @Test
        @DisplayName("Include inside range should return true")
        public void _include_inside_range() {
            assertEquals(true, closedRange.include(4,5));
        }

        @Test
        @DisplayName("Include inside range should return false")
        public void _include_outside_range() {
            assertEquals(false, closedRange.include(1,10));
        }
    }
}
