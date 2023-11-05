package homework_week_9;
/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programme_10_TubeLinesInZone1 {
    public static void main(String[] args) {
        //Create HashMap to map stations to the tube lines
        Map<String, Set<String>> stationsToLines = new HashMap<>();

        //Define zone 1 station and their associated tube lines
        stationsToLines.put("Oxford Circus", Set.of("Bakerloo", "Central", "Victoria"));
        stationsToLines.put("Kings Cross St Pancras", Set.of("Northern", "Piccadilly", "Victoria"));
        stationsToLines.put("Waterloo", Set.of("Bakerloo", "Jubilee", "Northern", "Waterloo & City"));
        // Add more stations and lines as needed

        // Specify the stations you want to check
        String station1 = "Oxford Circus";
        String station2 = "Kings Cross St Pancras";

        // Check which lines pass through the specified stations
        Set<String> linesAtStation1 = stationsToLines.get(station1);
        Set<String> linesAtStation2 = stationsToLines.get(station2);

        if (linesAtStation1 != null && linesAtStation2 != null) {
            // Find the common lines between the two stations
            Set<String> commonLines = new HashSet<>(linesAtStation1);
            commonLines.retainAll(linesAtStation2);

            if (!commonLines.isEmpty()) {
                System.out.println("The following line pass through both " + station1 + " and " + station2);
                for (String line : commonLines) {
                    System.out.println(line);
                }
            } else {
                System.out.println("No common line found between " + station1 + "and " + station2);
            }
        } else {
            System.out.println("One or both of the specified stations are not in zone 1. ");
        }
    }
}

