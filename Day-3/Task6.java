class Task6 {
  public static void main(String[] args) {
    EmailChecker e=new EmailChecker();
    System.out.println(e.email.contains("@"));
    System.out.println(e.email.contains("gmail"));
    
  }  
}
class EmailChecker{
    String email="komala@gmail.com";
}