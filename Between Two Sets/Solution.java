import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   /*
    * Complete the getTotalX function below.
    */
   static int getTotalX(int[] a, int[] b) {
               int count=0;
              int d=0;
            if(a.length>=b.length){
                d=a.length;
            }else{
                d=b.length;
            }

         for(int c=a[a.length-1];c<=b[0];c++){
                boolean isIt=true;
             for(int i=0;i<d;i++){
                 if(i<a.length){
                     if(c%a[i]!=0){
                         // do a boolean
                         isIt=false;
                     }
                 }

                 if(i<b.length){
                     if(b[i]%c !=0){
                         // do a boolean
                         isIt=false;

                     }
                 }
             } 
               if(isIt){
                   count++;
               }
         }
         return count;
   }

   private static final Scanner scan = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
       BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       String[] nm = scan.nextLine().split(" ");

       int n = Integer.parseInt(nm[0].trim());

       int m = Integer.parseInt(nm[1].trim());

       int[] a = new int[n];

       String[] aItems = scan.nextLine().split(" ");

       for (int aItr = 0; aItr < n; aItr++) {
           int aItem = Integer.parseInt(aItems[aItr].trim());
           a[aItr] = aItem;
       }

       int[] b = new int[m];

       String[] bItems = scan.nextLine().split(" ");

       for (int bItr = 0; bItr < m; bItr++) {
           int bItem = Integer.parseInt(bItems[bItr].trim());
           b[bItr] = bItem;
       }

       int total = getTotalX(a, b);

       bw.write(String.valueOf(total));
       bw.newLine();

       bw.close();
   }
}


