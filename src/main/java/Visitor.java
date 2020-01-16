import java.io.*;
import java.text.*;
import java.util.*;
import org.apache.logging.log4j.*;

public class Visitor {
private static final Logger logger = LogManager.getLogger(Visitor.class.getName());

    public String FULL_NAME;
    public int AGE;
    public String COMMENTS;
    public String ASSISTANCE_NAME;
    private String Date_Time;

    public void visitor(String full_name, int age, String comments, String assistance_name) {
        this.FULL_NAME=full_name;
        this.AGE=age;
        this.COMMENTS=comments;
        this.ASSISTANCE_NAME=assistance_name;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateObj = new Date();
        this.Date_Time = (df.format(dateObj));
    }

    public void save() {

        try {
            String file_name = "visitor_" + FULL_NAME + ".txt";

            String File_Name = file_name.replace(" ", "_").toLowerCase();

            FileWriter File = new FileWriter(File_Name);

            File.write("Full Name: " + this.FULL_NAME +"\n"+"Age: "+this.AGE +"\n"+"Comments: "+this.COMMENTS+"\n"
                       +"Assistance name: "+this.ASSISTANCE_NAME+"\n"+"Date and Time: "+this.Date_Time+"\n");
            File.close();

        } catch (IOException e) {
            System.out.println("Error occurred");
            logger.error(e.getMessage());

        }

    }
    public void load(String name){

        try {
            String file_name = "visitor_" + FULL_NAME + ".txt";

            String File_Name = file_name.replace(" ", "_").toLowerCase();

            FileReader reader = new FileReader(File_Name);
            Scanner input = new Scanner(reader);
            while(input.hasNextLine()){
                name = input.nextLine();
                System.out.println(name);
            }


            reader.close();

        }catch (IOException e){
            logger.error(e.getMessage());
        }

    }
}
