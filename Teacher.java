//class name.
//creates Teacher object, used for table
public class Teacher {
    
    // all values for the table
    //teacher name
    private String teacherName;
    //p1 course code
    private String period1;
    //p2 course code
    private String period2;
    //p4 course code
    private String period4;
    //p5 course code
    private String period5;
    
    //contructor that sets default values
    public Teacher() {
        this.teacherName = "";
        this.period1 = "None";
        this.period2 = "None";
        this.period4 = "None";
        this.period5 = "None";
    }
    
    //contructor that sets values depending on what user enters
    public Teacher(String teacherName, String period1, String period2, String period4, String period5) {
        
        this.teacherName = teacherName;
        this.period1 = period1;
        this.period2 = period2;
        this.period4 = period4;
        this.period5 = period5;
        
    }
    
    //getters and setters, meaning the user can say .get to get the value, and .set to set a value for a Teacher object
    public String getTeacherName() {
        return teacherName;
    }
    
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    public String getPeriod1() {
        return period1;
    }
    
    public void setPeriod1(String period1) {
        this.period1 = period1;
    }
    
    public String getPeriod2() {
        return period2;
    }
    
    public void setPeriod2(String period2) {
        this.period2 = period2;
    }
    public String getPeriod4() {
        return period4;
    }
    
    public void setPeriod4(String period4) {
        this.period4 = period4;
    }
    public String getPeriod5() {
        return period5;
    }
    
    public void setPeriod5(String period5) {
        this.period5 = period5;
    }
    
    
    //END
}
