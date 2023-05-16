import java.util.HashMap;
import java.util.Map;

/**
 * @ChatGPT
 * @author MOPHESHI
 */
public class TrieAlgorithm {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("banana");
        trie.insert("orange");

        System.out.println(trie.search("apple"));   // Output: true
        System.out.println(trie.search("grape"));   // Output: false

        System.out.println(trie.startsWith("app")); // Output: true
        System.out.println(trie.startsWith("ora")); // Output: true
    }
}

/**
 * Represents a node in the Trie and contains a map of child nodes, indicating
 * the next characters in the Trie, and a boolean flag to mark the end of a
 * word.
 */
class TrieNode {

    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

/**
 * Serves as the main Trie data structure and contains the root node. It
 * provides three main operations:
 * <p>
 * insert(String word): inserts a word into the Trie by iterating over each
 * character of the word and creating new nodes if necessary.
 * </p>
 * <p>
 * search(String word): searches for a given word in the Trie by traversing the
 * Trie based on the characters in the word. It returns true if the word exists
 * in the Trie and false otherwise.
 * </p>
 * <p>
 * startsWith(String prefix): determines if there is any word in the Trie that
 * starts with the given prefix by traversing the Trie based on the characters
 * in the prefix. It returns true if there is at least one word with the
 * specified prefix and false otherwise.
 * </p>
 */
class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
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
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return true;
    }
}
