package util;

public class Array {
    
    public static void printSorted(int[] t) {
        sort(t);
        print(t);
    }

    public static void sort(int[] t) {
        int max = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i] < t[j]) {
                    max = t[j];
                    t[j] = t[i];
                    t[i] = max;
                }
            }
        }
    }    

    public static void findMax(int[] t) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
                index = i;
            }
        }
        System.out.println("max int: " + max + " @ position: " + index);
    }

    public static void findMin(int[] t) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < min) {
                min = t[i];
                index = i;
            }
        }
        System.out.println("min int: " + min + " @ position: " + index);
    }
    
    


    public static void print(int[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }

    public static void print(String[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }

    public static void print(char[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }

    public static void printArray(float[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }
    
}
