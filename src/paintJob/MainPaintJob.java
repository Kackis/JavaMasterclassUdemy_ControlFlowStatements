package paintJob;

public class MainPaintJob {
    public static void main (String[]Args){
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        //getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1

        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        //getBucketCount(3.4, 2.1, 1.5, 2); → should return 3

        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        //getBucketCount(2.75, 3.25, 2.5, 1);→ should return 3

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        //getBucketCount(-3.4, 2.1, 1.5); → should return -1

        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        //getBucketCount(3.4, 2.1, 1.5); → should return 5

        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        //getBucketCount(7.25, 4.3, 2.35); → should return 14

        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        //getBucketCount(3.4, 1.5); → should return 3

        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        //getBucketCount(6.26, 2.2); → should return 3

        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
        //getBucketCount(3.26, 0.75); → should return 5
    }
}
