import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CalculateNumSumFromString {
    
    public int calculateSum(List<String> listOfInputs) {
        if (listOfInputs.size() < 11) {
            Set<Integer> setOfNumbers = listOfInputs.stream()
                    .map(this::calculateStringNumbers)
                    .collect(Collectors.toSet());
            return Collections.max(setOfNumbers);
        } else {
            throw new IllegalArgumentException("Input array size must not exceed 10 elements");
        }
    }

    private int calculateStringNumbers(String inputValue) {
        if(inputValue.length() <13) {
            int stringSum = 0;
            for (char numAsChar : inputValue.toCharArray()) {
                if (Character.isDigit(numAsChar)) {
                    int digit = Character.getNumericValue(numAsChar);
                    stringSum = stringSum + digit;
                }
            }
            return stringSum;
        }
        else {
            throw new IllegalArgumentException("Input String size must not exceed 12 char");
        }
    }
}
