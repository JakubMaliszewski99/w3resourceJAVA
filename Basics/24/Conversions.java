public class Conversions{
    public static int convBin2Dec(long binNum){

        int dec = 0;
        int i = 0;

        // Convert bin to dec
        while (binNum != 0){
            dec += binNum % 2 * Math.pow(2, i++);
            binNum /= 10;
        }

        return dec;
    }
    public static char[] convDec2Hex(int dec){

        char[] hex = new char[20];
        char[] hexAl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = 0;

        // Convert decimal to hex
        while (dec != 0){
            hex[i++] = hexAl[dec % 16];
            dec /= 16; 
        }

        return hex;
    }
    public static byte[] convDec2Oct(int dec){

        byte[] oct = new byte[20];
        byte i = 0;

        while(dec !=0){
            oct[i++] = (byte) (dec % 8);
            dec /= 8;
        }

        return oct;
    }
}