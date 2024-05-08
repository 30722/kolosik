
import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) throws Exception {// Tworzenie muzeum
                ArrayList<Exhibit> exhibits = new ArrayList<>();
                Museum museum = new Museum("123 Main St", "My Museum", exhibits);


                Exhibit exhibit1 = new Exhibit("Description 1", "Exhibit 1");
                Exhibit exhibit2 = new Exhibit("D2", "Exhibit 2");
                Artefact artefact = new Artefact("Artefact 1", "Artefact Description", "Author", "Year");
                Sculpture sculpture = new Sculpture("Sculpture 1", "Sculpture Description", "Marble", "Sculptor", "2024");
                Painting painting = new Painting("Painting 1", "Painting Description", "Impressionism", "Painter", "2024");
                exhibit2.showInfo();
                artefact.showInfo();
                sculpture.showInfo();
                painting.showInfo();


                museum.addExhibit(exhibit1);
                museum.addExhibit(exhibit2);
                museum.removeExhibit(exhibit2);
               // museum.removeExhibit(exhibit2);

    }
}
