import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Print print = new Print();
        ReadFromCSV filler = new ReadFromCSV();
        ArrayList<MovieInfo> print4 = filler.readFromCSV();
        print.print4();

    }
}