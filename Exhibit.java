import java.util.Date;

public class Exhibit {
    private static int exhibitCount = 1;
    private String lastMaintenanceDate;
    private String name;
    private String idNumber;
    private String description;



    public Exhibit(String description, String name) {
        this.name = name;
        this.idNumber = "exhibit#" + exhibitCount++;
        this.description = description;
        this.lastMaintenanceDate = new String();
    }
    public void showInfo(){
        System.out.println("Exhibit count" + exhibitCount);
        System.out.println("Last maintenance:" + lastMaintenanceDate);
        System.out.println("Nazwa:" + name  );
        System.out.println("Numer ID:" + idNumber  );
        System.out.println("Opis:" + description  );
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }
}
