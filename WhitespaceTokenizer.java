import java.util.Scanner;

class WhitespaceTokenizer {
    public static void main(String[] argv) {
        int start = 0;
        Scanner inp = argv.length > 0 ? 
            new Scanner(argv[0]) : new Scanner(System.in);
        while (inp.hasNext()) {
            for (String token : inp.nextLine().split("\\s")) {
                int end = start + token.length();
                System.out.println(
                        String.format("(%3d, %3d)\t%s", start, end, token));
                start = end + 1;
            }
        }
    }
}
