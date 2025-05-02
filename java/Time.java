public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time() {
        setTime(System.currentTimeMillis());
    }
    
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }
    
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() { 
        return hour; 
    }
    public int getMinute() { 
        return minute; 
    }
    public int getSecond() { 
        return second; 
    }
    
    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }
    
    public static void main(String args[]) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        System.out.printf("Current time from [5:30:00(IST)]: %d:%d:%d%n",t1.getHour(), t1.getMinute(), t1.getSecond());
        System.out.printf("Elapsed time: %d:%d:%d%n",t2.getHour(), t2.getMinute(), t2.getSecond());
    }
}