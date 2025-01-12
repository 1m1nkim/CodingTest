class Solution {
    public long solution(String numbers) {
        String[] numbersLine = {"zero", "one", "two", "three", "four", 
                                 "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < numbersLine.length; i++) {
            numbers = numbers.replaceAll(numbersLine[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
