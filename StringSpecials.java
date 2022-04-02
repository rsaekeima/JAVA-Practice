public class StringSpecials {
    public static void main(String[] args) {
        // length, lowercase, uppercase, substring, trim, replace, startsWith, endsWith,
        // charAt, indexOf, lastindexOf, equals, equalsIgnoreCase
        String name = "Rise Roar Revolt";
        System.out.print("Length of the string: ");
        System.out.println(name.length());

        System.out.print("Lowercase of the string: ");
        System.out.println(name.toLowerCase());

        System.out.print("Uppercase of the string: ");
        System.out.println(name.toUpperCase());

        System.out.print("Trimmed string: ");
        System.out.println(name.trim());

        System.out.print("Replace string: ");
        System.out.println(name.replace("R", "S"));

    }

}
