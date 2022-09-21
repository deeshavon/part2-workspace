package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Bill Gates", new Date(110, 1, 14), 25000.00);
  }

  @Test
  public void testPay() {
    assertEquals(25000.00, emp.getSalary(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(7500, emp.payTaxes(), 0.001);
  }
}