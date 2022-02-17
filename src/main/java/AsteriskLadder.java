public class AsteriskLadder {

    public static void main(String[] args) {
        int defaultLadderArg = 6;

        AsteriskLadder myInstance = new AsteriskLadder();

        System.out.println(myInstance.create(defaultLadderArg));
    }

    public String create(int number) {
        String ladder = "";

        for (int i = 1; i <= number; i++) {
            int qtyWhitespaces = number - i;
            int qtyAsterisks = number - qtyWhitespaces;

            String line = "";

            line += " ".repeat(Math.max(0, qtyWhitespaces));
            line += "*".repeat(Math.max(0, qtyAsterisks));

            ladder += line + "\n";
        }

        return ladder;
    }

}
