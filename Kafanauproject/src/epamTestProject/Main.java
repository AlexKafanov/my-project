package epamTestProject;

import epamTestProject.Impl.Event;
import epamTestProject.service.ReadFileToEvent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            ArrayList<Event> file = ReadFileToEvent.getFromFile(args[0]);
            for (Event c : file) {
                System.out.println(c);
            }
            ArrayList<Event> pass = new ArrayList<>();
            ArrayList<Event> notPassed = new ArrayList<>();
            for (Event f : file) {
                if (f.isPassed()) {
                    pass.add(f);
                } else {
                    notPassed.add(f);
                }
            }
            pass.sort(Event::compareTo);
            notPassed.sort(Event::compareTo);
            for (Event e : pass) {
                System.out.println((e.isPassed() ? "pass" : "notPassed") + e.getScaledMark());
                System.out.println(e);
            }
            for (Event e : notPassed) {
                System.out.println((e.isPassed() ? "pass" : "notPassed") + e.getScaledMark());
                System.out.println(e);
            }
            System.out.println("Scaled score between 40 and 50:");
            boolean b = file.stream().anyMatch(f -> (f.getScaledMark() <= 50) && (f.getScaledMark() >= 40));
            System.out.println(b ? "Yes" : "No");
        } else {
            System.exit(1);
        }
    }
}
