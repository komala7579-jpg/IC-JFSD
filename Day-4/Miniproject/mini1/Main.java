import java.util.*;

public class Main{
static Scanner sc=new Scanner(System.in);
static ArrayList<HashMap<String,Object>> books=new ArrayList<>();
static ArrayList<HashMap<String,Object>> members=new ArrayList<>();
static HashMap<Integer,HashMap<String,Object>> bookMap=new HashMap<>();
static LinkedHashMap<Integer,HashMap<String,Object>> issueRecords=new LinkedHashMap<>();
static HashSet<Integer> issuedBookIds=new HashSet<>();
static int nextMemberId=1001;
static int nextIssueId=1;

static int readInt(){
while(true){
try{return Integer.parseInt(sc.nextLine());}
catch(NumberFormatException e){System.out.print("Enter valid number: ");}
}
}

static void addBook(){
System.out.print("Enter Book ID: ");
int id=readInt();
if(bookMap.containsKey(id)){
System.out.println("Duplicate Book ID!");
return;
}
System.out.print("Enter Book Name: ");
String name=sc.nextLine();
System.out.print("Enter Author Name: ");
String author=sc.nextLine();
System.out.print("Enter Category: ");
String category=sc.nextLine();
System.out.print("Enter Available Copies: ");
int copies=readInt();
if(id<=0||copies<0){
System.out.println("Invalid Book ID or Copies!");
return;
}
HashMap<String,Object> book=new HashMap<>();
book.put("id",id);
book.put("name",name);
book.put("author",author);
book.put("category",category);
book.put("copies",copies);
books.add(book);
bookMap.put(id,book);
System.out.println("Book Added Successfully!");
}

static void displayBooks(){
if(books.isEmpty()){
System.out.println("No Books Available!");
return;
}
for(HashMap<String,Object> book:books){
System.out.println("\nBook ID: "+book.get("id"));
System.out.println("Book Name: "+book.get("name"));
System.out.println("Author: "+book.get("author"));
System.out.println("Category: "+book.get("category"));
System.out.println("Available Copies: "+book.get("copies"));
if((int)book.get("copies")==0)
System.out.println("Status: Unavailable");
}
System.out.println("Total Books: "+books.size());
}

static void searchBook(){
System.out.print("Enter Book ID: ");
int id=readInt();
HashMap<String,Object> book=bookMap.get(id);
if(book==null){
System.out.println("Book Not Found!");
return;
}
System.out.println("Book Found!");
System.out.println("Book ID: "+book.get("id"));
System.out.println("Book Name: "+book.get("name"));
System.out.println("Author: "+book.get("author"));
System.out.println("Category: "+book.get("category"));
System.out.println("Available Copies: "+book.get("copies"));
}

static void registerStudent(){
System.out.print("Enter Student Name: ");
String name=sc.nextLine();
System.out.print("Enter Contact Number: ");
String contact=sc.nextLine();
System.out.print("Enter Department: ");
String department=sc.nextLine();
System.out.print("Enter Year: ");
int year=readInt();
if(year<=0){
System.out.println("Invalid Year!");
return;
}
HashMap<String,Object> member=new HashMap<>();
member.put("id",nextMemberId++);
member.put("name",name);
member.put("contact",contact);
member.put("department",department);
member.put("year",year);
member.put("type","Student");
members.add(member);
System.out.println("Student Registered Successfully!");
System.out.println("Member ID: "+member.get("id"));
}

static void registerFaculty(){
System.out.print("Enter Faculty Name: ");
String name=sc.nextLine();
System.out.print("Enter Contact Number: ");
String contact=sc.nextLine();
System.out.print("Enter Department: ");
String department=sc.nextLine();
System.out.print("Enter Designation: ");
String designation=sc.nextLine();
HashMap<String,Object> member=new HashMap<>();
member.put("id",nextMemberId++);
member.put("name",name);
member.put("contact",contact);
member.put("department",department);
member.put("designation",designation);
member.put("type","Faculty");
members.add(member);
System.out.println("Faculty Registered Successfully!");
System.out.println("Member ID: "+member.get("id"));
}

static HashMap<String,Object> findMember(int id){
for(HashMap<String,Object> member:members){
if((int)member.get("id")==id)
return member;
}
return null;
}

static void displayMembers(){
if(members.isEmpty()){
System.out.println("No Members Registered!");
return;
}
for(HashMap<String,Object> member:members){
System.out.println("\nMember ID: "+member.get("id"));
System.out.println("Name: "+member.get("name"));
System.out.println("Contact: "+member.get("contact"));
System.out.println("Department: "+member.get("department"));
System.out.println("Type: "+member.get("type"));
if(member.get("type").equals("Student"))
System.out.println("Year: "+member.get("year"));
else
System.out.println("Designation: "+member.get("designation"));
}
System.out.println("Total Members: "+members.size());
}

static void searchMember(){
System.out.print("Enter Member ID: ");
int id=readInt();
HashMap<String,Object> member=findMember(id);
if(member==null){
System.out.println("Member Not Found!");
return;
}
System.out.println("Member Found!");
System.out.println("Member ID: "+member.get("id"));
System.out.println("Name: "+member.get("name"));
System.out.println("Contact: "+member.get("contact"));
System.out.println("Department: "+member.get("department"));
System.out.println("Type: "+member.get("type"));
if(member.get("type").equals("Student"))
System.out.println("Year: "+member.get("year"));
else
System.out.println("Designation: "+member.get("designation"));
}

static void issueBook(){
System.out.print("Enter Member ID: ");
int memberId=readInt();
System.out.print("Enter Book ID: ");
int bookId=readInt();
HashMap<String,Object> member=findMember(memberId);
if(member==null){
System.out.println("Invalid Member ID!");
return;
}
HashMap<String,Object> book=bookMap.get(bookId);
if(book==null){
System.out.println("Book Not Found!");
return;
}
if((int)book.get("copies")<=0){
System.out.println("No Copies Available!");
return;
}
for(HashMap<String,Object> record:issueRecords.values()){
if((int)record.get("memberId")==memberId&&(int)record.get("bookId")==bookId&&(boolean)record.get("active")){
System.out.println("Book Already Issued to This Member!");
return;
}
}
book.put("copies",(int)book.get("copies")-1);
HashMap<String,Object> record=new HashMap<>();
record.put("issueId",nextIssueId);
record.put("memberId",memberId);
record.put("bookId",bookId);
record.put("bookName",book.get("name"));
record.put("active",true);
issueRecords.put(nextIssueId++,record);
issuedBookIds.add(bookId);
System.out.println("Book Issued Successfully!");
System.out.println("Member: "+member.get("name"));
System.out.println("Book: "+book.get("name"));
System.out.println("Available Copies: "+book.get("copies"));
}

static void returnBook(){
System.out.print("Enter Member ID: ");
int memberId=readInt();
System.out.print("Enter Book ID: ");
int bookId=readInt();
HashMap<String,Object> member=findMember(memberId);
if(member==null){
System.out.println("Member Not Found!");
return;
}
HashMap<String,Object> book=bookMap.get(bookId);
if(book==null){
System.out.println("Book Not Found!");
return;
}
HashMap<String,Object> activeRecord=null;
for(HashMap<String,Object> record:issueRecords.values()){
if((int)record.get("memberId")==memberId&&(int)record.get("bookId")==bookId&&(boolean)record.get("active")){
activeRecord=record;
break;
}
}
if(activeRecord==null){
System.out.println("No Active Issue Record Found!");
return;
}
book.put("copies",(int)book.get("copies")+1);
activeRecord.put("active",false);
boolean stillIssued=false;
for(HashMap<String,Object> record:issueRecords.values()){
if((int)record.get("bookId")==bookId&&(boolean)record.get("active")){
stillIssued=true;
break;
}
}
if(!stillIssued)
issuedBookIds.remove(bookId);
System.out.println("Book Returned Successfully!");
System.out.println("Member: "+member.get("name"));
System.out.println("Book: "+book.get("name"));
System.out.println("Available Copies: "+book.get("copies"));
}

static void displayIssuedBooks(){
if(issueRecords.isEmpty()){
System.out.println("No Issue Records Found!");
return;
}
System.out.println("1. Display All Records");
System.out.println("2. Display Active Records Only");
System.out.print("Enter Choice: ");
int choice=readInt();
if(choice!=1&&choice!=2){
System.out.println("Invalid Choice!");
return;
}
boolean found=false;
for(HashMap<String,Object> record:issueRecords.values()){
boolean active=(boolean)record.get("active");
if(choice==2&&!active)
continue;
System.out.println("\nIssue ID: "+record.get("issueId"));
System.out.println("Member ID: "+record.get("memberId"));
System.out.println("Book ID: "+record.get("bookId"));
System.out.println("Book Name: "+record.get("bookName"));
System.out.println("Issue Status: "+(active?"Active":"Returned"));
found=true;
}
if(!found)
System.out.println("No Active Issue Records!");
}

static void generateReport(){
int totalCopies=0;
int unavailableBooks=0;
int activeIssues=0;
for(HashMap<String,Object> book:books){
int copies=(int)book.get("copies");
totalCopies+=copies;
if(copies==0)
unavailableBooks++;
}
for(HashMap<String,Object> record:issueRecords.values()){
if((boolean)record.get("active"))
activeIssues++;
}
System.out.println("\n========== LIBRARY REPORT ==========");
System.out.println("Total Books Registered: "+books.size());
System.out.println("Total Registered Members: "+members.size());
System.out.println("Total Active Issue Records: "+activeIssues);
System.out.println("Total Available Copies: "+totalCopies);
System.out.println("Unavailable Books: "+unavailableBooks);
System.out.println("Unique Issued Book IDs: "+issuedBookIds.size());
System.out.println("====================================");
}

public static void main(String[] args){
int choice;
do{
System.out.println("\n========================================");
System.out.println("       LIBRARY MANAGEMENT SYSTEM");
System.out.println("========================================");
System.out.println("1. Add Book");
System.out.println("2. Display All Books");
System.out.println("3. Search Book");
System.out.println("4. Register Student");
System.out.println("5. Register Faculty");
System.out.println("6. Display All Members");
System.out.println("7. Search Member");
System.out.println("8. Issue Book");
System.out.println("9. Return Book");
System.out.println("10. Display Issued Books");
System.out.println("11. Generate Library Report");
System.out.println("12. Exit");
System.out.print("Enter Your Choice: ");
choice=readInt();
switch(choice){
case 1:addBook();break;
case 2:displayBooks();break;
case 3:searchBook();break;
case 4:registerStudent();break;
case 5:registerFaculty();break;
case 6:displayMembers();break;
case 7:searchMember();break;
case 8:issueBook();break;
case 9:returnBook();break;
case 10:displayIssuedBooks();break;
case 11:generateReport();break;
case 12:System.out.println("Thank You!");break;
default:System.out.println("Invalid Choice!");
}
}while(choice!=12);
sc.close();
}
}