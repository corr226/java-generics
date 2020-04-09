package shopping;

import java.time.LocalDate;

public class Shopping {
  public static void main(String[] args) {
    ClothingPair<Glove> pg = new ClothingPair<>(
        new Glove(8, "Black"), new Glove(7, "Black"));

    System.out.println(pg);
    System.out.println("Pair is matched? " + pg.matched());

    ClothingPair<Glove> pg2 = new ClothingPair<>(
        new Glove(8, "Black"), new Glove(8, "Brown"));
    System.out.println("Pair2 is matched? " + pg2.matched());

    Glove l =  new Glove(8, "Green");
    Glove r =  new Glove(8, "Red");
    // Inferencing, normal when successful
//    boolean pairIsOK = ClothingPair.match(l, r);
    boolean pairIsOK = ClothingPair.<Glove>match(l, r);
    System.out.println("Christmas pair match? " + pairIsOK);
  }
}
