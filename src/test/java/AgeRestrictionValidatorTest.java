package test.java;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/*Test Case 1: Age Just Below Minimum (17)
Test Case 2: Age At Minimum Boundary (18)
Test Case 3: Age Just Above Minimum (19)
Test Case 4: Age Just Below Maximum (64)
Test Case 5: Age At Maximum Boundary (65)
Test Case 6: Age Just Above Maximum (66)
Test Case 7: Extreme Low Age (0)
Test Case 8: Extreme High Age (100)*/

public class AgeRestrictionValidatorTest {
    AgeRestrictionValidator ageRestrictionValidator = new AgeRestrictionValidator();

    @Test
    void ageJustBelowMinimum() {
        assertFalse(ageRestrictionValidator.isEligible(17));
    }

    @Test
    void ageAtMinimumBound() {
        assertTrue(ageRestrictionValidator.isEligible(18));
    }

    @Test
    void ageJustAboveMinimum() {
        assertTrue(ageRestrictionValidator.isEligible(19));
    }

    @Test
    void ageJustBelowMaximum() {
        assertTrue(ageRestrictionValidator.isEligible(64));
    }

    @Test
    void ageAtMaximumBound() {
        assertTrue(ageRestrictionValidator.isEligible(65));
    }

    @Test
    void ageJustAboveMaximum() {
        assertFalse(ageRestrictionValidator.isEligible(66));
    }

    @Test
    void extremeLowAge() {
        assertFalse(ageRestrictionValidator.isEligible(0));
    }

    @Test
    void extremeHighAge() {
        assertFalse(ageRestrictionValidator.isEligible(100));
    }
}