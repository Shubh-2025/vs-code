public class StopWatch {
    private long startTime;
    private long endTime;
    
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public long getStartTime() { return startTime; }
    public long getEndTime() { return endTime; }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
    
    public static void main(String[] args) {
        // Generate 100,000 random numbers
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }
        StopWatch watch = new StopWatch();
        watch.start();
        
        // Selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        watch.stop();
        System.out.println("Time to sort 100,000 numbers: " +watch.getElapsedTime() + " milliseconds");
    }
}
