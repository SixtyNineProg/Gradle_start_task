package by.klimov;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

  @Test
  void isPositiveNumber() {
    assertTrue(StringUtil.isPositiveNumber("3.14"));
  }
}
