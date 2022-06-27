package Lec15_Inheritance.com.lec.java.inherit07;

public class BusinessPerson extends Person {
    // 멤버 변수
    private String company;

    // getter & setter
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("회사: " + company);
    }

    // 오버로딩
    private void showInfo(int id) {
        System.out.println("id: " + id);
        System.out.println("이름: " + getName());
        System.out.println("회사: " + company);
    }

    @Override
    public String toString() {
        return String.format("BusinessPerson: %s %s", getName(), getCompany());
    }
}
