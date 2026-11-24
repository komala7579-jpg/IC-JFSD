public class University {
    public static void main(String[] args){
        Professor p=new Professor();
        AdminOfficer ao=new AdminOfficer();
        p.conductlecture();
        p.Attendmeeting();
        p.checkIn();
        ao.Processfiles();
    }
    
}
class UniversityMemeber{
    int MemberID=101;
    void checkIn(){
        System.out.println("Member Checked in");
    }
}
class Staff extends UniversityMemeber{
    String Deparment="AI&DS";
    void Attendmeeting(){
        System.out.println("attended the meeting of "+Deparment+"member");
    }
}
class Professor extends Staff{
    String subject="Java";
    void conductlecture(){
        System.out.println("conducting lecture");
    }
    }
    class AdminOfficer extends Staff{
        int Officeroom=01;
        void Processfiles(){
            System.out.println("process the files which are in  room"+Officeroom);
        }
    }