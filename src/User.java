public class User {
    private String fName;
    private String lName;
    private String email;
    private int schoolRegNo;
    private int phone;


    public User(int phone, int schoolRegNo, String email, String lName, String fName) {
        this.phone = phone;
        this.schoolRegNo = schoolRegNo;
        this.email = email;
        this.lName = lName;
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSchoolRegNo() {
        return schoolRegNo;
    }

    public void setSchoolRegNo(int schoolRegNo) {
        this.schoolRegNo = schoolRegNo;
    }



    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}