package ChessBoard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InputValidityTest {

  @Test
  @DisplayName("checkValidity method correctly validate the input")
  void testCheckValidity() {

    assertAll(
        () -> assertTrue(InputValidity.checkValidity("1 3")),
        () -> assertTrue(InputValidity.checkValidity("10 3")),
        () -> assertTrue(InputValidity.checkValidity("20 5")),
        () -> assertTrue(InputValidity.checkValidity("25 30")),
        () -> assertFalse(InputValidity.checkValidity("56")),
        () -> assertFalse(InputValidity.checkValidity("a 6")),
        () -> assertFalse(InputValidity.checkValidity("5 b")),
        () -> assertFalse(InputValidity.checkValidity("a b")),
        () -> assertFalse(InputValidity.checkValidity("ab")));
  }
}
