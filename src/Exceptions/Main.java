package Exceptions;

public class Main {
    public static void main(String[] args) {
        String arithmeticErrors = testArithmeticException();
        String nullPointerErrors = testNullPointerException();
        String arrayIndexErrors = testArrayIndexOutOfBoundsException();
        String stringIndexErrors = testStringIndexOutOfBoundsException();
        String illegalArgumentErrors = testIllegalArgumentException();
        String numberFormatErrors = testNumberFormatException();
        String classCastErrors = testClassCastException();
        String illegalStateErrors = testIllegalStateException();

        System.out.println(arithmeticErrors);
        System.out.println(numberFormatErrors);
        System.out.println(arrayIndexErrors);
        System.out.println(stringIndexErrors);
        System.out.println(illegalStateErrors);
        System.out.println(nullPointerErrors);
        System.out.println(classCastErrors);
        System.out.println(illegalStateErrors);
    }

    public static String testArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught ArithmeticException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testArithmeticException");
        }
        return "OK";
    }

    public static String testNullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught NullPointerException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testNullPointerException");
        }
        return "OK";
    }

    public static String testArrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[5];
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught ArrayIndexOutOfBoundsException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testArrayIndexOutOfBoundsException");
        }
        return "OK";
    }

    public static String testStringIndexOutOfBoundsException() {
        try {
            String str = "hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught StringIndexOutOfBoundsException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testStringIndexOutOfBoundsException");
        }
        return "OK";
    }

    public static String testIllegalArgumentException() {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught IllegalArgumentException:"+ g);
//            e.printStackTrace();
        } catch (InterruptedException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught InterruptedException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testIllegalArgumentException");
        }
        return "OK";
    }

    public static String testNumberFormatException() {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught NumberFormatException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testNumberFormatException");
        }
        return "OK";
    }

    public static String testClassCastException() {
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught ClassCastException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testClassCastException");
        }
        return "OK";
    }

    public static String testIllegalStateException() {
        try {
            throw new IllegalStateException("Illegal state occurred");
        } catch (IllegalStateException e) {
            String g = e.getClass().getSimpleName();
            System.out.println("Caught IllegalStateException:"+ g);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed in testIllegalStateException");
        }
        return "OK";
    }
}
