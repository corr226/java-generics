package taxable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Accountants {
  public static void prepareTaxReturn(Taxable t) {}

  // Co-variance Java Style
  public static void prepareBulkTaxReturns(List<? extends Taxable> lt) {
//    lt.add(new Corporation()); // KNOW NOTHING about opposite direction assignment
    for (Taxable t : lt) {
      prepareTaxReturn(t);
    }
  }

  // Joe's way of collecting clients.
  // ? super X means ? accepts assignment FROM Individual
  // Contra-variance Java style
  public static void addIndividualClients(List<? super Individual> li) {
//    Individual i = li.get(0);
    li.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> clients = Arrays.asList(
        new Corporation(),
        new Individual()
    );

    addIndividualClients(clients);

    prepareBulkTaxReturns(clients);

    List<Individual> joesClients = Arrays.asList(
        new Individual(),
        new Individual()
    );
    prepareBulkTaxReturns(joesClients);

    List<Corporation> lc = Arrays.asList();
    prepareBulkTaxReturns(lc);
  }
}
