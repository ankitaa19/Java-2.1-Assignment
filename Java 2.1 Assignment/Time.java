public class Time {
    private int hr;
    private int min;
    private int sec;

  
    public Time() {
        hr = 12;
        min = 0;
        sec = 0;
    }

   
    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalizeTime();
    }

   
    public Time(int seconds) {
        hr = seconds / 3600;
        min = (seconds % 3600) / 60;
        sec = seconds % 60;
        normalizeTime();
    }

  
    public void setClock(int seconds) {
        hr = seconds / 3600;
        min = (seconds % 3600) / 60;
        sec = seconds % 60;
        normalizeTime();
    }

   
    public void tick() {
        sec++;
        if (sec >= 60) {
            sec = 0;
            min++;
            if (min >= 60) {
                min = 0;
                hr++;
                if (hr >= 24) {
                    hr = 0;
                }
            }
        }
    }

   
    public void tickDown() {
        sec--;
        if (sec < 0) {
            sec = 59;
            min--;
            if (min < 0) {
                min = 59;
                hr--;
                if (hr < 0) {
                    hr = 23;
                }
            }
        }
    }

  
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    private void normalizeTime() {
        while (sec >= 60) {
            sec -= 60;
            min++;
        }
        while (min >= 60) {
            min -= 60;
            hr++;
        }
        hr %= 24;
    }
}