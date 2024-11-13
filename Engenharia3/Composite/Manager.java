import java.util.ArrayList;
import java.util.List;

public class Manager implements CompanyMember {
    public String name;
    private List<CompanyMember> subordinates;
    public Manager(String name) {
        this.name = name;
        subordinates = new ArrayList<CompanyMember>();
    }
    public void AddSubordinate (CompanyMember subordinate){
        subordinates.add(subordinate);
    }
    public int count(){
        int count = 0;
        for (CompanyMember f: subordinates) {
            count += f.count();
        }
        return count;
    }

}
