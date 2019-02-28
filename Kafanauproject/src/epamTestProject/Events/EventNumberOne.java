package epamTestProject.Events;


import epamTestProject.Impl.Event;

public class EventNumberOne extends Event {
    private int mark1;
    private int mark2;
    private float value;

    public EventNumberOne(int mark1, int mark2, float value) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.value = value;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public boolean isPassed() {
        return (mark1 + mark2) >= value;
    }

    @Override
    public int getScaledMark() {
        return (mark1 + mark2) * 5;
    }

    @Override
    public String toString() {
        return "EventNumberOne{" +
                "mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", value=" + value +
                '}';
    }
}
