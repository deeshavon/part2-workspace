package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {

  static IRS getInstance() {
    return IRSEnum.INSTANCE;  //IRSEnum isn't the same return type as IRS until it's implemented on line 15 in IRSEnum.java
  }

  void collectTaxes();

  void register(TaxPayer payer);

}
