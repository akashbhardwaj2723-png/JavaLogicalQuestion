public class MyPattern {
  public static void main(String[] args) {
      System.out.println("Hello miss");
      int num = 10;
//pattern pranting 
      for (int i = 0; i < num; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}

// // reverse pattern pranting
//  for (int i = num; i >=0; i--) {
//           for (int j = 0; j <= i; j++) {
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
//   }
// }