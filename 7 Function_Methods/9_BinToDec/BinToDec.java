public class BinToDec {

    public static void BINtoDEC(int binNum) {
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, power);
            binNum /= 10;
            power++;
        }

        System.out.println("Decimal Number: " + decNum);
    }

    public static void main(String[] args) {
        int binNum = 111;
        BINtoDEC(binNum);
    }
}