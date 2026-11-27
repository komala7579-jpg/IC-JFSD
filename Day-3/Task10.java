public class Task10 {
    public static void main(String[] args) {
        Texteditor t=new Texteditor();
        System.out.println("Original sentence:"+(t.sentence));
        System.out.println("Modified sentence:"+(t.sentence.replace("python", "Java")));
        
    }
    
}
class Texteditor{
    String sentence="I love python programming";

}
