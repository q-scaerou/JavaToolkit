package util.time;

public class StopWatch {

    private long start;
    private long now;

    public StopWatch() {

    }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        if (start != 0) {
            now = System.currentTimeMillis();
        }
    }

    public String toString() {
        long delta = now - start;
        if (delta > 0 && start != 0) {
        long deltaS = delta / 1000;
        long deltaMS = delta % 1000;
        return deltaS + "." + String.format("%03d", deltaMS) + "s";
        } else if (now == 0 && start != 0) {
            return "Have you considered stopping the StopWatch?";
        } else {
            return "Please start the StopWatch before stopping it.";
        }
    }

}
