package jb10;
public class InternshipEmployee extends Employee {
    private  int lenght;
    
    public InternshipEmployee(String name, int lenght) {
        this.lenght = lenght;
        this.name = name;
    }
    public int getLength(){
      return lenght;  
    }
    public void setLength(int length) {
        this.lenght = length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee for "+lenght+" month/s\n";
        return info;
    }   
}