public class Painting extends Exhibit {
    private String style;
    private String author;
    private String year;
    public void showInfo(){
        System.out.println("Styl:" + style);
        System.out.println("Autor:" + author);
        System.out.println("Rok:" + year);
    }
    public Painting(String name, String description, String style, String author,String year){
        super(name, description);
        this.author = author;
        this.style = style;
        this.year = year;

    }


}
