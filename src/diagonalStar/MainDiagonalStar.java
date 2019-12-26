package diagonalStar;

public class MainDiagonalStar {
    public static void main (String[]Args){
        System.out.println("Printed of 5th");
        DiagonalStar.printSquareStar(5);
        System.out.println();
        System.out.println("Printed of zero");
        DiagonalStar.printSquareStar(0);
        System.out.println("Printed of - 5");
        DiagonalStar.printSquareStar(-5);
        System.out.println("Printed of 2");
        DiagonalStar.printSquareStar(2);
        //Doesn't write "Invalid Value", when number is incorrect
    }
}
