public class inverted_pattern {
    public static void main(String[] args) {
        for (int line=4; line>=1; --line) {
            for (int star=1; star<=line; ++star ){  //Inner loop same rakha, outer change krra h
                System.out.print("*");
            }
            System.out.println();

            // or see screenshot for anoother way
        }
    }
}