package numberToWords;

public class MainNumberToWords {
    public static void main (String[]Args){
        System.out.println("Number to words: ");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);
        System.out.println();

        //Wrong output. There is lack op spaces between digits!

        System.out.println("Reverse number: ");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println(NumberToWords.reverse(0));
        System.out.println();

        System.out.println("Counted digits: ");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println();

    }
}
