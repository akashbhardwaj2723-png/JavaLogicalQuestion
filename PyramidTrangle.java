public class   PyramidTrangle{
public static void main(String[] args) {
    


int rows = 4;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}



    // int n=10;
    // for (int i = 0; i <n; i++) {
     
     
    //  for (int j = 0; j <i; j++) {
    //       System.out.print(j);
// 0
// 01
// 012
// 0123
// 01234
// 012345
// 0123456
// 01234567
// 012345678
       

        //  System.out.print(i);
// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777
// 88888888
// 999999999
    //  }   
    //  System.out.println( );
    // }
       int n=10;
    for (int i = 0; i <=n; i++) {
     for (int j = 0; j <=n-i; j++) {
           System.out.print(" ");
             }  
             for (int k= 0; k <=i; k++) {
          System.out.print( "* ");
             }    
     
       System.out.println( );
    }
    
 }
 }
 
 