public class Task15 {
    public static void main(String[] args) {
        FileValidator f=new FileValidator();
        if(f.filename.endsWith(".pdf")){
            System.out.println("pdf file ");
        }
        else{
            System.out.println("Different format file");
        }
        if(f.filename1.endsWith(".jpg")){
            System.out.println("jpg file ");
        }
        else{
            System.out.println("Different format file");
        }
        if(f.filename.endsWith(".docx")){
            System.out.println("docx file ");
        }
        else{
            System.out.println("Different format file");
        }
        }
    }
class FileValidator{
    String filename="student.pdf";
    String filename1="student.jpg";
    String filename2="student.docx";
}
