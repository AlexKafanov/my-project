package epamTestProject.Events;

import epamTestProject.Impl.Event;

public class EventNumberThree extends Event {
    private boolean test1;
    private boolean test2;
    private float mark1;
    private float value;

    public EventNumberThree(boolean test1, boolean test2, float mark1, float value) {
        this.test1 = test1;
        this.test2 = test2;
        this.mark1 = mark1;
        this.value = value;
    }

    public boolean isTest1() {
        return test1;
    }

    public void setTest1(boolean test1) {
        this.test1 = test1;
    }

    public boolean isTest2() {
        return test2;
    }

    public void setTest2(boolean test2) {
        this.test2 = test2;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(float mark1) {
        this.mark1 = mark1;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EventNumberThree{" +
                "test1=" + (test1 ? "pass" : "notPassed") +
                ", test2=" + (test2 ? "pass" : "notPassed") +
                ", mark1=" + mark1 +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean isPassed() {
        return (mark1 >= value) && test1 && test2;
    }

    @Override
    public int getScaledMark() {
        return (int) mark1;
    }
}
