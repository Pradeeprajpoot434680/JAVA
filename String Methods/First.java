class First {
    public static void main(String[] arg){
        String s = "My name is Pradeep";
        System.out.println(s);
        System.out.println(s.charAt(1));// character at index 1
        System.out.println(s.codePointAt(3));// unicode value of character at index 3
        System.out.println(s.compareTo("My Name is pradeep"));// compares two strings
        System.out.println(s.compareToIgnoreCase("My Name is pradeep"));// compares two strings ignoring case
        System.out.println(s.concat(" Hello"));// concatenates two strings
        System.out.println(s.contains("Prade"));// checks whether the string contains the given sequence of char values
        System.out.println(s.contentEquals("My name is Pradeep")); // check whether the content is same or not
        System.out.println(s.endsWith("eep"));// checks whether the string ends with the given suffix
        System.out.println(s.equals("My name is Pradeep"));// checks whether two strings are equal or not
        System.out.println(s.equalsIgnoreCase("my name is pradeep"));// checks whether two strings are equal or not ignoring case
        System.out.println(s.indexOf('a'));//   index of first occurrence of character
        System.out.println(s.valueOf(0)); // converts different types to string
        System.out.println(s.indexOf('a', s.indexOf('a') + 1)); // to find the next index of a character
        System.out.println(s.lastIndexOf('e'));// index of last occurrence of character
        System.out.println(s.length());// length of the string
        System.out.println(s.replace('e', 'E'));// replaces all occurrences of a character with another character
        System.out.println(s.replace("Pradeep", "Kumar"));// replaces all occurrences of a substring with another substring
        System.out.println(s.substring(3, 7));// returns the substring from the given begin index to end index
        System.out.println(s.toLowerCase());// converts the string to lowercase
        System.out.println(s.toUpperCase());// converts the string to uppercase
        System.out.println(s.trim());// removes leading and trailing whitespace
        System.out.println(s.startsWith("My"));// checks whether the string starts with the given prefix
        System.out.println(s.isEmpty());// checks whether the string is empty
        System.out.println(s.split(" ")); // returns an array
        String arr[] = s.split(" ");    
        // for(String w : arr){
        //     System.out.println(w);
        // }
    }
};