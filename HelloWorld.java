public class HelloWorld {
    public static void main(String[] args) {

        String message = "Hello, ";

        if (args.length == 0) {
            message += "World!";
        } else {
            String names = "";

            // Enhanced for loop
            for (String name : args) {
                names += name + ", ";
            }

            // Remove last comma and space using substring
            names = names.substring(0, names.length() - 2);

            message += names + "!";
        }

        System.out.println(message);
    }
}