import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Uses HashMap to store character patterns
 * and renders banner via reusable function.
 */
public class OOPSBannerUC8 {

    /**
     * Builds and returns a Map of character patterns.
     *
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Renders banner for given word
     *
     * @param word Message to display
     * @param map  Character pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String word = "OOPS";

        renderBanner(word, characterMap);
    }
}