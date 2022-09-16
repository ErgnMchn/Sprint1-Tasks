import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidityTest {

    @Test
    void testValidityFirstEnvelopeHeight() {
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("10.5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("50"));
        assertFalse(InputValidity.checkValidityFirstEnvelopeHeight("a"));
    }

    @Test
    void checkValidityFirstEnvelopeWidth() {
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("10.5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("50"));
        assertFalse(InputValidity.checkValidityFirstEnvelopeHeight("a"));
    }

    @Test
    void checkValiditySecondEnvelopeHeight() {
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("10.5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("50"));
        assertFalse(InputValidity.checkValidityFirstEnvelopeHeight("a"));
    }

    @Test
    void checkValiditySecondEnvelopeWidth() {
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("10.5"));
        assertTrue(InputValidity.checkValidityFirstEnvelopeHeight("50"));
        assertFalse(InputValidity.checkValidityFirstEnvelopeHeight("a"));
    }
}