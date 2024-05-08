public class Artefact extends Exhibit{
    private String material;
    private String timePeriod;
    public void showInfo(){
        System.out.println("Materiał:" + material);
        System.out.println("Okres:" + timePeriod);
    }
    public Artefact(String name, String description,String author,String year){
        super(description, name);
        this.material = material;
        this.timePeriod = timePeriod;


    }
}
