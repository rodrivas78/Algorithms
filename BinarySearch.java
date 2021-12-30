
import java.util.Scanner;

class BinarySearch {
  public static void main(String[] args) {
    
    int max, min, med, numberSearched, steps;

    // int[] repo = {1, 3, 8, 17, 21, 35, 46, 67, 88, 109, 129};

    int[] repo = {
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94,95, 96, 97, 198, 199
    };

    int size = repo.length;

    double maxCompareNumber = (Math.log(size) / Math.log(2)) + 1;

    Scanner enterNumber = new Scanner(System.in);
    for (;;) {
      max = size - 1;
      min = repo[0];
      med = 0;
      numberSearched = 0;
      steps = 1;

      System.out.println("Enter desired number: ");

      numberSearched = enterNumber.nextInt();

      if (numberSearched < min || numberSearched > repo[max]) continue;

      if (numberSearched != repo[max]) {
        med = max / 2;
      } else {
        med = max;
      }

      while (repo[med] != numberSearched && steps < maxCompareNumber) {
        if (numberSearched > repo[med]) {
          min = med;
          min++;
          System.out.println("min: " + min + ",");
          System.out.println("max: " + max + ",");
          med = (max - min) / 2 + min;
          System.out.println("numberSearched > repo[med]: " + repo[med] + ",");
          steps++;
        } else {
          max = med;
          max--;
          System.out.println("min: " + min + ",");
          System.out.println("max: " + max + ",");
          med = (max - min) / 2 + min;        
          System.out.println("numberSearched < repo[med]: " + repo[med] + ",");
          steps++;
        }
      }
      if (steps > maxCompareNumber) {
        System.out.println("The list does not contain this item.");
      } else {
        System.out.println("FOUND! " + "Number searched: " + numberSearched + " indice: " + med);
        System.out.println("Steps: " + steps + "\n");
      }
    }
  }
}
