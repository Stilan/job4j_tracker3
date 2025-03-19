package ru.job4j.tracker.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    public void whenCorrectFormatString() {
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.validate("user@example.com");
        assertTrue(result);
    }

    @Test
    public void whenFormatStringNotSymbols() {
        EmailValidator emailValidator = new EmailValidator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    emailValidator.validate("userexample.com");
                });
        assertThat(exception.getMessage()).isEqualTo("No contains format string");
    }

    @Test
    public void whenFormatStringNotPoint() {
        EmailValidator emailValidator = new EmailValidator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    emailValidator.validate("user@examplecom");
                });
        assertThat(exception.getMessage()).isEqualTo("No contains format string");
    }

    @Test
    public void whenFormatStringNotString() {
        EmailValidator emailValidator = new EmailValidator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    emailValidator.validate("");
                });
        assertThat(exception.getMessage()).isEqualTo("No contains format string");
    }
}