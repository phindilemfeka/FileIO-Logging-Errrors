import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Visitor visit = new Visitor();
        visit.visitor("Phindile Mfeka",25,"No comments","Shirley Ndou");
        visit.save();
        visit.load("");



    }
}
