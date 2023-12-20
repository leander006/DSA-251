import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Q5 {

	public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {

		// Map to store the indices of groups of anagrams.
		HashMap<String, ArrayList<Integer>> anagramGroup = new HashMap<>();
		// To store the frequencies of characters.

		for (int i = 0; i < n; i++) {

			int count[] = new int[26];
			// Store the frequencies.
			for (int j = 0; j < inputStr.get(i).length(); j++) {
				count[inputStr.get(i).charAt(j) - 'a']++;
			}

			// Generate the key.
			String key = "";

			for (int j = 0; j < 26; j++) {

				key += "#";
				key += count[j];
			}

			// Store the index of current string corresponding to the key.
			if (anagramGroup.containsKey(key)) {
				ArrayList<Integer> list = anagramGroup.get(key);
				list.add(i);
				anagramGroup.put(key, list);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				anagramGroup.put(key, list);
			}
		}
		ArrayList<ArrayList<String>> groupedAnagram = new ArrayList<>();
		// Find all the anagram groups.
		for (Map.Entry mapElement : anagramGroup.entrySet()) {
			ArrayList<String> curr = new ArrayList<String>();

			ArrayList<Integer> value = (ArrayList<Integer>) mapElement.getValue();
			for (int i = 0; i < value.size(); i++) {
				curr.add(inputStr.get(value.get(i)));
			}

			groupedAnagram.add(curr);
		}
		return groupedAnagram;
	}

}