class First {
    public static void main(String[] arg){
        String s = "My name is Pradeep";
        System.out.println(s);
        System.out.println(s.charAt(1));
        System.out.println(s.codePointAt(3));// unicode
        System.out.println(s.compareTo("My Name is pradeep"));
        System.out.println(s.concat(" Hello"));
        System.out.println(s.contains("Prade"));
        System.out.println(s.contentEquals("My name is Pradeep")); // check whether the content is same or not
        System.out.println(s.endsWith("eep"));
        System.out.println(s.equals("My name is Pradeep"));
        System.out.println(s.equalsIgnoreCase("my name is pradeep"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.valueOf(0)); // converts different types to string
        System.out.println(s.indexOf('a', s.indexOf('a') + 1)); // to find the next index of a character
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.length());
        System.out.println(s.replace('e', 'E'));
        System.out.println(s.replace("Pradeep", "Kumar"));
        System.out.println(s.substring(3, 7));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.startsWith("My"));
        System.out.println(s.isEmpty());
        System.out.println(s.split(" ")); // returns an array
        String arr[] = s.split(" ");    
        // for(String w : arr){
        //     System.out.println(w);
        // }
    }
};