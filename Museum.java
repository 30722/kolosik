import java.util.ArrayList;

public class Museum {
    private String address;
    private String name;
    private ArrayList<Exhibit> exhibit;
    public Museum(String address, String name, ArrayList<Exhibit> exhibit) {
        this.address = address;
        this.name = name;
        this.exhibit = exhibit;
    }
    public void addExhibit (Exhibit ex) throws Exception {
        if(exhibit.contains(ex)){
            throw new Exception("juz jest");
        } else{
            exhibit.add(ex);
        }
    }
    public void removeExhibit(Exhibit ex) throws Exception {
        if(exhibit.contains(ex)){
            exhibit.remove(ex);
        } else{
            throw new Exception("nie ma takiego");
        }
    }

    public void showLastMaintenanceDate(Exhibit ex){
        System.out.println(ex.getLastMaintenanceDate());
    }
}

