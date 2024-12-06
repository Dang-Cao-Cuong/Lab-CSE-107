package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String[] parts = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += parts[i];
        }
        return output;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String[] parts = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (!parts[i].equals(parts[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {

        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String[] parts = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            boolean check = false;
            for (int j = 0; j < 9; j++) {
                if (parts[i].equals(j + "")) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                output += parts[i];
            }
        }
        return output;

    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        String output = "";
        output = input.toUpperCase();
        return output;
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        String output = "";
        output = input.toLowerCase();
        return output;
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] parts = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        int i = 0;
        do {
            parts[0] = parts[0].toUpperCase();
            if (parts[i].equals(" ")) {
                parts[i + 1] = parts[i + 1].toUpperCase();
            }
            i++;

        } while (i < input.length());
        for (int j = 0; j < input.length(); j++) {
            output += parts[j];
        }
        return output;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        String[] parts = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(parts[i].toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String[] parts = new String[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            parts[i] = sentence.charAt(i) + "";
        }
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (parts[i].equals(" ")) {
                count++;
            }
        }
        return count;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            String text = input.substring(i);
            if (text.startsWith(substring)) {
                index = i;
            }
        }
        return index;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] parts = sentence.split(" ");
        String output = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            output += parts[i];
            if (i != 0) {
                output += " ";
            }
        }

        return output;
    }
}
