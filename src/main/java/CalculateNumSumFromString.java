import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CalculateNumSumFromString {

    public static void main(String args[]) {
        CalculateNumSumFromString calculateNumSumFromString = new CalculateNumSumFromString();
        Integer maxNum1 = calculateNumSumFromString.calculateSum(List.of("dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"));
        Integer maxNum2 = calculateNumSumFromString.calculateSum(List.of("dh7js5jf", "or2rjvn4w", "h1n37mfl", "a7e8fw"));
        System.out.println(maxNum1);
        System.out.println(maxNum2);
    }

    private Integer calculateSum(List<String> listOfInputs) {
        Set<Integer> setOfNumbers = listOfInputs.stream()
                .map(this::calculateStringNumbers)
                .collect(Collectors.toSet());
        return Collections.max(setOfNumbers);
    }

    private int calculateStringNumbers(String inputValue) {
        int stringSum = 0;
        for (char numAsChar : inputValue.toCharArray()) {
            if (Character.isDigit(numAsChar)) {
                int digit = Character.getNumericValue(numAsChar);
                stringSum = stringSum + digit;
            }
        }
        return stringSum;
    }
}
