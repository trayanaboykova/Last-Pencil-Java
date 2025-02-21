class Encode {
    static String transform(String input) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        int vowelIndex = 1;

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(vowelIndex++);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}