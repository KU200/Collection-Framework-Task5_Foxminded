import java.util.HashMap;

public class CharacterCounter {

    private static HashMap<String, String> cashMap = new HashMap<String, String>();

    public static void setCashMap(HashMap<String, String> inputMap) {
        cashMap = inputMap;
    }

    private HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> countedMap = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (countedMap.containsKey(character)) {
                int characterQuantity = countedMap.get(character);
                countedMap.put(character, ++characterQuantity);
            } else {
                countedMap.put(character, 1);
            }
        }
        return countedMap;
    }

    public String outResult(String input) {
        try {
            if (cashMap.containsKey(input))
                return cashMap.get(input);
            else
                cashResult(input, countCharacters(input));
            return cashMap.get(input);
        } catch (NullPointerException nPe) {
            return "Input is null, please input no null string";
        }
    }

    public static String convertMapToString(HashMap<Character, Integer> inputMap) {
        StringBuilder mapAsString = new StringBuilder();
        for (Character key : inputMap.keySet()) {
            if (key == ' ')
                mapAsString.append("\"" + " " + "\"" + " - " + inputMap.get(key) + "\n");
            else
                mapAsString.append("\"" + key + "\"" + " - " + inputMap.get(key) + "\n");
        }
        try {
            mapAsString.delete(mapAsString.length() - 1, mapAsString.length());
        } catch (IndexOutOfBoundsException iObe) {
            System.out.println("Empty string, please input no empty string");
        }
        return mapAsString.toString();
    }

    static void cashResult(String input, HashMap<Character, Integer> inputMap) {
        HashMap<String, String> tempMap = new HashMap<String, String>();
        tempMap.put(input, convertMapToString(inputMap));
        CharacterCounter.setCashMap(tempMap);
    }
}
