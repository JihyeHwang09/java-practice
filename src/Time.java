class Time {
private int hour;
private int minute;
private int second;

        Time (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        }
public int getHour() { return hour; }
public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
        }
// ...중간 생략
public String toString () {
        return hour + ":" + minute + ":" + second;
        }
public static void main(String[] args) {
        Time t = new Time(12, 35, 20);
        System.out.println(t.toString());

        }


        }