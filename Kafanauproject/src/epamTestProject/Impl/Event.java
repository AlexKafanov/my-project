package epamTestProject.Impl;

public abstract class Event implements Comparable<Event> {
    public abstract boolean isPassed();

    public abstract int getScaledMark();

    public int compareTo(Event e) {
        if (isPassed() == e.isPassed()) {
            if (getScaledMark() > e.getScaledMark()) {
                return -1;
            } else if (getScaledMark() < e.getScaledMark()) {
                return 1;
            } else return 0;
        }
        if (isPassed() && !e.isPassed()) {
            return -1;
        } else return 1;
    }
}

