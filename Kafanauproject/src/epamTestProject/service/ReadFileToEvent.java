package epamTestProject.service;


import epamTestProject.Events.EventNumberOne;
import epamTestProject.Events.EventNumberThree;
import epamTestProject.Events.EventNumberTwo;
import epamTestProject.Impl.Event;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ReadFileToEvent {
    public static ArrayList<Event> getFromFile(String file) throws InputMismatchException {
        ArrayList<Event> list = null;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String lines;
            while ((lines = fileReader.readLine()) != null) {
                if (lines.startsWith(" ") || lines.equals("")) continue;
                String[] line = Arrays.stream(lines.split(" "))
                        .filter(s -> !s.isEmpty())
                        .toArray(String[]::new);
                if (list == null) {
                    if (line[0].equals("lengthString")) {
                        list = new ArrayList<>(Integer.parseInt(line[0] + 1));
                    } else {
                        list = new ArrayList<>();
                    }
                    continue;
                }
                switch (line[0]) {
                    case "EventNumberOne":
                        list.add(new EventNumberOne(
                                Integer.parseInt(line[1]),
                                Integer.parseInt(line[2]),
                                Integer.parseInt(line[3])
                        ));
                        break;
                    case "EventNumberTwo":
                        list.add(new EventNumberTwo(
                                Float.parseFloat(line[1]),
                                Float.parseFloat(line[2]),
                                Float.parseFloat(line[4]),
                                line[3].equals("1")
                        ));
                        break;
                    case "EventNumberThree":
                        list.add(new EventNumberThree(
                                line[1].equals("1"),
                                line[2].equals("1"),
                                Float.parseFloat(line[3]),
                                Float.parseFloat(line[4])
                        ));
                        break;
                    default:
                        throw new InputMismatchException();
                }

            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
