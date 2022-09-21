package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

 private Television tv1;

 @Before
 public void setUp() {
  tv1 = new Television("Toshiba", 50, DisplayType.PLASMA);

 }

  @Test
  public void testSetVolume() {
  assertEquals(50, tv1.getVolume());

  }

  @Test
  public void testChangeChannel() {
  assertEquals(75, tv1.changeChannel());
  }

  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {
    fail();
  }

  @Test
  public void testEquals() {
    fail();
  }
}