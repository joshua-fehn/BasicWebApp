package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

        } else if (query.contains("plus")) {
            String s[] = query.split("what is ");
            String s1[] = s[1].split(" plus ");
            int sum = 0;
            for (String strig : s1) {
                sum += Integer.valueOf(strig);
            }
            return String.valueOf(sum);
        } else if (query.contains("mul")) {
            return "Master";
        } else { // TODO extend the programm here
            return "";
        }
    }

    public static void main(String[] args) {
        String s2 = "Received query 7e8b9390: what is 9 plus 11";

        String s[] = s2.split("what is ");
        String s1[] = s[1].split(" plus ");
        int sum = 0;
        for (String strig : s1) {
            sum += Integer.valueOf(strig);
        }
        System.out.println(String.valueOf(sum));

    }

}
