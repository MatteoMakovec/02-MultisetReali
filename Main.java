import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n\nWRITE TWO COMMA-SEPARATED LISTS OF REAL NUMBERS\n");
    System.out.println("Write the first list of real numbers: \t(number1,number2,...,numberN)");
    String list1 = scanner.nextLine();
    System.out.println("Write the second list of real numbers: \t(number1,number2,...,numberN)");
    String list2 = scanner.nextLine();
    scanner.close();

    double[] firstMultiset = determineDoubleMultiset(list1);
    double[] secondMultiset = determineDoubleMultiset(list2);
    BagOfRealNumbers firstBag = new BagOfRealNumbers(firstMultiset);
    BagOfRealNumbers secondBag = new BagOfRealNumbers(secondMultiset);
    System.out.println("\nFirst multiset: {" + firstBag.toString() + "}");
    System.out.println("\nSecond multiset: {" + secondBag.toString() + "}");
    if(firstBag.equals(secondBag)){
      System.out.println("\nThey are the same multiset");
    }else{
      System.out.println("\nThey are different multisets");
    }
  }

  private static double[] determineDoubleMultiset(String list){
    String[] items = list.split(",");
    int numberOfItems = items.length;
    double[] finalList = new double[numberOfItems];
    for (int i = 0; i < numberOfItems; i++){
      finalList[i] = Double.parseDouble(items[i]);
    }

    return finalList;
  }
}