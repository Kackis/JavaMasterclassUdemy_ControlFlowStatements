package largestPrimeNumber;

public class MainLargestPrime {
    public static  void main (String[]Args){
        System.out.println(LargestPrime.getLargestPrime(21)); // 7
        System.out.println(LargestPrime.getLargestPrime(217)); // 31
        System.out.println(LargestPrime.getLargestPrime(0)); // -1
        System.out.println(LargestPrime.getLargestPrime(45)); // 5
        System.out.println(LargestPrime.getLargestPrime(-1)); // -1

    }
}
