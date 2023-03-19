package trie;

public class TestTrie {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("abc");
		t.insert("abcd");
		
		System.out.println(t.search("test"));
		System.out.println(t.search("abc"));
		System.out.println(t.search("ab"));

	}

}
