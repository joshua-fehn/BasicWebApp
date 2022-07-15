package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Master";
        } else if (query.contains("largest")) {
            String s[] = query.split("largest: ");
            String numbers[] = s[1].split(", ");
            int largest = Integer.valueOf(numbers[0]);
            for (String string : numbers) {
                if (Integer.valueOf(string) > largest) {
                    largest = Integer.valueOf(string);
                }
            }
            return String.valueOf(largest);

        } else if (query.contains("sub")) {
            return "Master";
        } else if (query.contains("mul")) {
            return "Master";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
