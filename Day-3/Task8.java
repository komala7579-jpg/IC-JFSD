public class Task8{
    public static void main(String[] args) {
        WordAnalyzer w = new WordAnalyzer();

        System.out.println("First occurrence of 'a': " + w.word.indexOf('a'));
        System.out.println("Last occurrence of 'a': " + w.word.lastIndexOf('a'));

        System.out.println("First occurrence of 'n': " + w.word.indexOf('n'));
        System.out.println("Last occurrence of 'n': " + w.word.lastIndexOf('n'));
    }
}

class WordAnalyzer {
    String word = "banana";
}