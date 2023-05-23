package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String word = new String(characters);
        return word;
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        long count = 0;

        for (int i = 0; i < text.length(); i++ ) {
            // charAt gives character at certain position
            // check if character at position is the given character
            if (text.charAt(i) == character) {
                // if so then add to counter
                ++count;
            }
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        
        // where the reverse string will be stored
        String reverse = "";
        // length of word
        int wordLength = word.length();
        
        // loop through every character of word string
        for (int i = 0; i < wordLength; i++) {
            // starting from the end of the string, add the characters into the reverse variable
            reverse += word.charAt(wordLength - 1 - i);
        }

        // return whether reverse and word are palindrome (they should be equal if so)
        return reverse.equals(word);
    }

    public String getName() {
        return "String Exercises";
    }
}
