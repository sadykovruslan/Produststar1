package Collections.Schedule;

public class Event implements Comparable <Event> {
    int start;
    int end;
    String title;

    @Override
    public int compareTo(Event o) {
        if (start == o.start) {
            return Integer.compare(end, o.end);
        } else return Integer.compare(start, o.start);
    }

    @Override
    public String toString() {
        return "[ " + start + " ]" +  "[ " + end + " ]: " + title;
    }

}
