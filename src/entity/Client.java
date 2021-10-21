
package entity;


public class Client {
     private String Name;
    private String Surname;
    private String MobileNumber;
    private Double Money;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double Money) {
        this.Money = Money;
    }

    @Override
    public String toString() {
        return "Client{" + "Name=" + Name + ", Surname=" + Surname + ", MobileNumber=" + MobileNumber + ", Money=" + Money + '}';
    }
    


}
    

    

