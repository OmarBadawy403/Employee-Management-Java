package emolyeemangement;

enum Gender {male , famele}

public abstract class  Employee {
    
    String Name ;
    int SSN ;
    String Address ;
    Gender sex ; 

    public Employee() {
    }

    public Employee(String Name, int SSN, String Address, Gender sex) {
        this.Name = Name;
        this.SSN = SSN;
        this.Address = Address;
        this.sex = sex;
    }
  
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
   
    public abstract double earning();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", SSN=" + SSN + ", Address=" + Address + ", sex=" + sex + '}';
    }
    
    
}
