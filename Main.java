import util.*;
import util.time.StopWatch;
public class Main {

    public static void main(String[] args) {
        StopWatch c = new StopWatch();
        c.start();
        int[] t = {4, 2, 1, 3};
        Array.print(t);
        Array.findMax(t);
        Array.findMin(t);
        Array.sort(t);
        Array.print(t);
        t[0] = 4;
        t[1] = 2;
        t[2] = 1;
        t[3] = 3;
        Array.print(t);
        Array.printSorted(t);
        File.read("README.md");
        c.stop();
        System.out.println(c);    
    }
}