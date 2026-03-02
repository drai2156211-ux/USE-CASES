/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns inside an Inner Static Class
 * following OOPS principles like Encapsulation, Abstraction and Modularity.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class that encapsulates
     * a character and its 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character Character to store
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns stored character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns stored banner pattern
         *
         * @return 7-line String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     *
     * @return String[] representing O
     */
    public static String[] createOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    /**
     * Utility method to create P pattern
     *
     * @return String[] representing P
     */
    public static String[] createPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    /**
     * Utility method to create S pattern
     *
     * @return String[] representing S
     */
    public static String[] createSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    /**
     * Main Method - Assembles and prints OOPS banner
     */
    public static void main(String[] args) {

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('P', createPPattern()),
                new CharacterPatternMap('S', createSPattern())
        };

        String word = "OOPS";

        // Loop through 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        lineBuilder.append(cp.getPattern()[row]).append("  ");
                        break;
                    }
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}