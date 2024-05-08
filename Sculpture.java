public class Sculpture extends Exhibit {
    private String material;
    private String author;
    private String year;
    public void showInfo(){
        System.out.println("Materiał:" + material);
        System.out.println("Autor:" + author);
        System.out.println("Rok:" + year);
    }
    public Sculpture (String name, String description, String material, String author, String year){
        super(name, description);
        this.author = author;
        this.material = material;
        this.year = year;

    }
}
