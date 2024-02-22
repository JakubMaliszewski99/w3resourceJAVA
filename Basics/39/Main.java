/*39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24 */

public class Main{
    public static void main(String[] args) {
        byte [] number = new byte[3];
        byte nrOfPossibilities = 0;

        for(byte i = 1; i<=4; i++){
            number[0] = i;

            for(byte j = 1; j<=4; j++){
                if(number[0] != j)
                    number[1] = j;
                else continue;
                for(byte k = 1; k<=4; k++){
                    if(number[0]!= k && number[1] != k){
                        number[2] = k;
                        nrOfPossibilities++;
                        System.out.println("" + number[0] + number[1] + number[2]);
                    }
                    else continue;
                }
            }
        }
        System.out.println("Total number of the three-digit number is: " + nrOfPossibilities);
    }
}