import java.util.*;

class TimeException extends Exception {
    TimeException(String msg) {
        super(msg);
    }

    public String toString() {
        return getMessage();
    }
}

class Expt6_3 {
    static void testException() throws TimeException {
        throw new TimeException("TimeException: Seconds is greater than 60");
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Hardik Shah    |    16010221025\n");
        System.out.print("1.Time\nMinutes: ");
        int m1 = ob.nextInt();
        System.out.print("Seconds: ");
        int s1 = ob.nextInt();
        System.out.print("2.Time\nMinutes: ");
        int m2 = ob.nextInt();
        System.out.print("Seconds: ");
        int s2 = ob.nextInt();
        int m = m1 + m2;
        int s = s1 + s2;
        if (s > 60) {
            try {
                testException();
            } catch (TimeException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Total time: " + m + "minutes " + s + "seconds");
        }
    }
}
