package trie;

import java.util.HashMap;
import java.util.Map;

class Trie {

    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node currNode = root;

        for(int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if(!currNode.data.containsKey(c)) {
                currNode.data.put(c, new Node());
            }
            currNode = currNode.data.get(c);
        }
        currNode.isEnd = true;
    }
    
    public boolean search(String word) {
        Node currNode = root;

        for(int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if(!currNode.data.containsKey(c)) {
                return false;
            }
            currNode = currNode.data.get(c);
        }
        return currNode.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node currNode = root;
        for(int i=0;i<prefix.length();i++) {
            char c = prefix.charAt(i);
            if(!currNode.data.containsKey(c)) {
                return false;
            }
            currNode = currNode.data.get(c);
        }
        return true;
    }
}

class Node {
    public Map<Character, Node> data = new HashMap<>();
    public boolean isEnd;
}
