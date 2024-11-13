public class Employee implements CompanyMember{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public int count(){
        return 1;
    }
}
