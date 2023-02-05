public class Palindrom {

     static void  isPalindrom(int number) {
         int temp = number, reverseNumber = 0, lastNumber;

         while (temp != 0) {
             lastNumber = temp % 10;

             reverseNumber = (reverseNumber * 10) + lastNumber;
             temp /= 10;

         }

         if (number == reverseNumber) {
             System.out.println(number+ " is Palindrom number.");
         }
          else {
             System.out.println(number + " isn't Palindrom number.");
         }

     }
         public static void main (String[]args){
            isPalindrom(252);

         }
     }