package klimov;

import static org.junit.jupiter.api.Assertions.assertTrue;

import by.klimov.StringUtil;
import org.junit.jupiter.api.Test;

class StringUtilTest {

  @Test
  void isPositiveNumber() {
    assertTrue(StringUtil.isPositiveNumber("3.14"));
  }
}
