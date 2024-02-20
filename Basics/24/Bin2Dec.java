public class Bin2Dec{
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
}