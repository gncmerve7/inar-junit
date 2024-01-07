package test.java;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*Test Cases for validateUsername Method
Test Case 1: Valid Email Address
Test Case 2: Email Without @ Symbol
Test Case 3: Email Without Domain
Test Case 4: Email With Invalid Characters Test Case 5: Empty Email String
Test Case 6: Null Email Address
Test Cases for validatePassword Method
Test Case 1: Valid Password
Test Case 2: Password Without Special Character
Test Case 3: Password Without Number
Test Case 4: Password Too Short (Less than 8 Characters) Test Case 5: Password Too Long (More than 16 Characters) Test Case 6: Empty Password String
Test Case 7: Null Password*/

public class LoginValidatorTest {
    LoginValidator loginValidator = new LoginValidator();

    @Test
    void validEmailAddressTest() {
        assertTrue(loginValidator.validateUsername("merve@gmail.com"));
    }

    @Test
    void testEmailAddressWithoutAt() {
        assertFalse(loginValidator.validateUsername("mervegmail.com"));
    }

    @Test
    void testEmailAddressWithoutDomain() {
        assertFalse(loginValidator.validateUsername("merve@"));
    }

    @Test
    void testEmailAddressWithInvalidCharacters() {
        assertFalse(loginValidator.validateUsername("mer& ve@gmail.com"));
    }

    @Test
    void emptyEmailAddressTest() {
        assertFalse(loginValidator.validateUsername(" "));
    }

    @Test
    void nullEmailAddressTest() {
        assertFalse(loginValidator.validateUsername(null));
    }

    @Test
    void validPasswordTest() {
        assertTrue(loginValidator.validatePassword("Asasas7.#"));
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        boolean result = loginValidator.validatePassword("asasas7");
        assertFalse(result);
    }

    @Test
    void testPasswordWithoutNumber() {
        assertFalse(loginValidator.validatePassword("asasas.as"));
    }

    @Test
    void passwordTooShortTest() {
        assertFalse(loginValidator.validatePassword("as7#"));
    }

    @Test
    void passwordTooLongTest() {
        assertFalse(loginValidator.validatePassword("asasasasasasasasas"));
    }

    @Test
    void emptyPasswordTest() {
        assertFalse(loginValidator.validatePassword(""));
    }

    @Test
    void nullPasswordTest() {
        boolean result = loginValidator.validatePassword(null);
        assertFalse(result);
    }
}
