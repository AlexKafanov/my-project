package epamTestProject.Events;

import epamTestProject.Impl.Event;

public class EventNumberTwo extends Event {
    private float mark1;
    private float mark2;
    private float value;
    private boolean test1;

    public EventNumberTwo(float mark1, float mark2, float value, boolean test1) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.value = value;
        this.test1 = test1;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public void setMark2(float mark2) {
        this.mark2 = mark2;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isTest1() {
        return test1;
    }

    public void setTest1(boolean test1) {
        this.test1 = test1;
    }

    @Override
    public boolean isPassed() {
        return (mark1 + mark2)>= value && test1;
    }

    @Override
    public int getScaledMark() {
        return Math.round((mark1 + mark2) * 5);
    }

    @Override
    public String toString() {
        return "EventNumberTwo{" +
                "mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", value=" + value +
                ", test1=" + (test1 ? "pass" : "notPassed") +
                '}';
    }
}
