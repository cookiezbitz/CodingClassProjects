public class BoxWord {
    public static String go(String word) {
        String output = "";
        int len = word.length();
        String revword = "";

        for (int i = len - 1; i >= 0; i--) {
            revword += word.charAt(i);
        }

        for (int x = 0; x < len; x++) {
            if (x == 0) {
                output += word;
            } else if (x == len - 1) {
                output += revword;
            } else {
                output += word.charAt(x);
                for (int spaces = 0; spaces < len - 2; spaces++) {
                    output += " ";
                }
                output += word.charAt(len - x - 1);
            }
            output += "\n";
        }
        return output;
    }
}
