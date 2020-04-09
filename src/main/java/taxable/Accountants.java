package taxable;

import java.util.Arrays;
import java.util.List;

public class Accountants {
  public static void prepareTaxReturn(Taxable t) {}

  public static void prepareBulkTaxReturns(List<Taxable> lt) {
    for (Taxable t : lt) {
      prepareTaxReturn(t);
    }
  }

  public static void main(String[] args) {
    List<Taxable> clients = Arrays.asList(
        new 
    );
  }
}
