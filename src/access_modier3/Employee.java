package access_modier3;

public class Employee {
    private int passportNo;

    public Employee(int passportNo) {
//        if (passportNo <= 0) {
//            throw new IllegalArgumentException("Passport number must be greater than zero");
//        }
//        this.passportNo = passportNo;
//        this.setPassportNo(passportNo);
    }

    public int getPassportNo() {
        return passportNo;
    }

//    public void setPassportNo(int passportNo) {
//        if (passportNo <= 0) {
//            throw new IllegalArgumentException("Passport number must be greater than zero");
//        }
//        this.passportNo = passportNo;
//    }

    @Override
    public String toString(){
        return "Employee [passportNo: " + passportNo + " ]";
    }
}
