package StreamAPI1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static int sumOfEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int findMaxElement(List<Integer> list) {
        return list.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static int findAverageValue(List<Integer> list) {
        return (int) list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public static int countString(List<String> list, char character) {
       return (int) list.stream()
               .filter(s -> s.startsWith(String.valueOf(character)))
               .count();
    }

    public static List listSpecificSubstring(List<String> list, String str){
        return list.stream()
                .filter(s -> s.contains(str))
                .collect(Collectors.toList());
    }

    public static List listByLength(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());
    }

    public static boolean allElementsOK(List<String> list,  String  condition) {
        return list.stream().allMatch(s -> s.equals(condition));
    }

    public static int findSmallestValueFromList(List <Integer> values, int condition) {
        return values.stream()
                .filter(num -> num > condition)
                .min(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
    }

    public static List convertToLengths(List<String> strings) {
        return strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}