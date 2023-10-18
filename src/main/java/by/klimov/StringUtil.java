package by.klimov;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringUtil {
  public static boolean isPositiveNumber(String str) {
    try {
      double d = Double.parseDouble(str);
      return d > 0;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
