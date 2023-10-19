package by.klimov;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest {

  @Test
  void isAllPositiveNumbers() {
    assertTrue(Util.isAllPositiveNumbers("3.14", "3.1415"));
  }
}
