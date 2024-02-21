import java.util.Scanner;

public class Zadanie18{
    public static void main(String[] args){
        // Program to multiply 2 binary numbers
        long bin1, bin2;
        byte i = 0, j = 0;
        byte reminder = 0;
        byte[] mult = new byte[20];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give 2 binary numbers: ");
        bin1 = scanner.nextLong();
        bin2 = scanner.nextLong();

        if(bin1 < bin2){
            long temp = 0;
            temp = bin1;
            bin1 = bin2;
            bin2 = temp;
        }
        
        if(bin2 == 0){
            mult[i] = 0;
            System.out.println("Result: " + mult[i]);
            scanner.close();
            return;
        }

        long bin1copy;
        byte currDigit = 0;
        while(bin2!=0){

            if(bin2 % 2 == 1){
                bin1copy = bin1;
                j = i;
                reminder = 0;

                while(bin1copy != 0)
                {
                    currDigit = mult[j];
                    mult[j] = (byte)((bin1copy % 2 + currDigit + reminder) % 2);
                    reminder = (byte)((bin1copy % 2 + currDigit + reminder) / 2);
                    bin1copy /= 10;
                    j++;
                }

                if (reminder != 0){
                    mult[j] = reminder;
                    j++;
                }

            }

            i++;
            bin2 /= 10;
        }

        j--;
        while(j>=0){
            System.out.print(mult[j--]);
        }
        scanner.close();
    }
}