import java.util.*;

/**
 * In this example, we have modified the Trie class to include a frequency
 * variable that keeps track of the number of times a word is inserted into the
 * Trie. We have also added two new methods: getFrequency(String word) and
 * getFrequentlySearchedWords(int limit).
 * <p>
 * The 'getFrequency(String word)method returns the frequency of a given word by
 * traversing the Trie based on the characters in the word and returning
 * thefrequency' value stored in the last node.
 * </p>
 * <p>
 * The getFrequentlySearchedWords(int limit) method returns a list of the most
 * frequently searched words up to the specified limit. It uses a breadth-first
 * search (BFS) approach to traverse the Trie and collect the words that have a
 * non-zero frequency, up to the limit.
 * </p>
 * <p>
 * In the main method, we create a new Trie object, insert some words into it,
 * and then call the getFrequentlySearchedWords method to obtain the most
 * frequently searched words. In this example, we specify a limit of 2, so it
 * will return the top two frequently searched words.
 * <p/>
 *
 * @author MOPHE
 * @ChatGPT
 */
public class Frequents {

    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C++", "Java", "JavaScript", "Python", "Python", "C++", "Java", "Java"};
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        List<String> frequentlySearchedWords = trie.getFrequentlySearchedWords(2);
        System.out.println("Frequently searched words: " + frequentlySearchedWords);
    }
}

class TrieNode {

    Map<Character, TrieNode> children;
    boolean isEndOfWord;
    int frequency;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
        frequency = 0;
    }
}

class Trie {

    private final TrieNode ROOT;

    public Trie() {
        ROOT = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = ROOT;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.isEndOfWord = true;
        current.frequency++;
    }

    public int getFrequency(String word) {
        TrieNode current = ROOT;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return 0;
            }
            current = node;
        }
        return current.frequency;
    }

    public List<String> getFrequentlySearchedWords(int limit) {
        List<String> result = new ArrayList<>();
        Queue<TrieNode> queue = new LinkedList<>();
        queue.offer(ROOT);
        while (!queue.isEmpty()) {
            TrieNode current = queue.poll();
            if (current.isEndOfWord && current.frequency > 0) {
                result.add(getWord(current));
                if (result.size() == limit) {
                    break;
                }
            }
            for (TrieNode child : current.children.values()) {
                queue.offer(child);
            }
        }
        return result;
    }

    private String getWord(TrieNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != ROOT) {
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                if (entry.getValue() == node) {
                    sb.insert(0, entry.getKey());
                    break;
                }
            }
            node = getParent(node);
        }
        return sb.toString();
    }

    private TrieNode getParent(TrieNode node) {
        Queue<TrieNode> queue = new LinkedList<>();
        queue.offer(ROOT);
        while (!queue.isEmpty()) {
            TrieNode current = queue.poll();
            for (TrieNode child : current.children.values()) {
                if (child == node) {
                    return current;
                }
                queue.offer(child);
            }
        }
        return null;
    }
}
