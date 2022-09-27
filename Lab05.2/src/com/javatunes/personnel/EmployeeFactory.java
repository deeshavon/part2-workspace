/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;

public class EmployeeFactory {

  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }

  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map< String, String > inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;
    String type = inputMap.get("type");
    // TODO: 9/26/22 If type is not equal to "HE" or "SE", then throw IllegalArgumentException. 
    // TODO: 9/26/22 Read the name and hireDate from inputMap. (Remember: All of the values in
    //  the map are Strings, but hireDate is java.sql.Date.)
    // TODO: 9/26/22 If type is equal to "HE", then read (and parse) rate and hours from inputMap. 
    // TODO: 9/26/22 If type is equal to "SE", then read (and parse) salary from inputMap. 
    // TODO: 9/26/22 Create an instance & return of HourlyEmployee or SalariedEmployee, with the values read from inputMap.
    if(!type.equals("HE") ||! type.equals("SE")) {
      throw new IllegalArgumentException();
    }else if(type.equals("HE")) {
      double rate = Double.parseDouble(inputMap.get ("rate"));
      emp = (HourlyEmployee) HourlyEmployee.createEmployee(inputMap);

    }else if(type.equals("SE")){
      double salary = Double.parseDouble(inputMap.get("salary"));
    }
    return emp;
  }
}