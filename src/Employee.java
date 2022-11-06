public class Employee {
    private  String nameEmployee;
    private  String posotionEmployee;
    private  String emailEmployee;
    private  String contactPhoneNumberEmployee;
    private int ageEmployee;

    public Employee(String nameEmployee, String posotionEmployee, String emailEmployee,
                    String contactPhoneNumberEmployee, int ageEmployee) {
        this.nameEmployee = nameEmployee;
        this.posotionEmployee = posotionEmployee;
        this.emailEmployee = emailEmployee;
        this.contactPhoneNumberEmployee = contactPhoneNumberEmployee;
        if (ageEmployee <0) return;
        this.ageEmployee = ageEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getPosotionEmployee() {
        return posotionEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public String getContactPhoneNumberEmployee() {
        return contactPhoneNumberEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }
}
