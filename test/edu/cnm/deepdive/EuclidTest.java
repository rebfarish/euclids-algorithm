package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidTest {

  @Test
  void gcdInt() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(38_593_253, 53_777_929)),
        () -> assertEquals(6791, Euclid.gcd(38_593_253, -53_777_929)),
        () -> assertEquals(6791, Euclid.gcd( 53_777_929, 38_593_253)),
        () -> assertEquals(53_777_929, Euclid.gcd( 53_777_929, 0)),
        () -> assertEquals(53_777_929, Euclid.gcd( 0, 53_777_929)),
        () -> assertEquals(1, Euclid.gcd( 53_777_929, 1)),
        () -> assertEquals(1, Euclid.gcd(1, 53_777_929)),
        () -> assertNotEquals(5, Euclid.gcd(7,9))
    );

  }

  @Test
  void gcdLong() {
  }
}