public class AsteriskLadder {

    public String create(int number) {
        StringBuilder ladder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            int qtyWhitespaces = number - i;
            int qtyAsterisks = number - qtyWhitespaces;

            String line = "";

            line += " ".repeat(Math.max(0, qtyWhitespaces));
            line += "*".repeat(Math.max(0, qtyAsterisks));

            ladder.append(line).append("\n");
        }

        return ladder.toString();
    }

}
