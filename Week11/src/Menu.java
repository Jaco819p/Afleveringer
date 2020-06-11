import java.util.*;

public class Menu {

    Scanner input;


    public void mainMain() {

        input = new Scanner(System.in);

        System.out.println("|------------------------------|");
        System.out.println("1: Vital Information");
        System.out.println("2: Search for an actor");
        System.out.println("3: Search for an director");
        System.out.println("4: List of ratings(Descending)");
        System.out.println("5: List of ratings(Ascending)");
        System.out.println("6: Write to File");
        System.out.println("7: Exit");
        System.out.println("|------------------------------|");

        int choice = input.nextInt();

        if (choice > 7 || choice < 0) {
            mainMain();
        }

        switch (choice) {
            case 1:
                print4();
            case 2:
                searchForActor();
            case 3:
                searchForDirector();
            case 4:
                ratingsDesc();
            case 5:
                ratingsAsc();
            case 6:
                writeToCSV();
            case 7:
                System.exit(0);
        }
    }

    public void print4() {
        MovieInfo mov = new MovieInfo();
        mov.printFour();

        mainMain();
    }

    public void searchForActor() {
        input = new Scanner(System.in);
        System.out.println("What actor are you looking for?");
        String name = input.nextLine();

        MovieInfo mov = new MovieInfo();
        mov.searchForActor(name);
        mainMain();
    }

    public void searchForDirector() {
        input = new Scanner(System.in);
        System.out.println("Which director are you looking for?");
        String name = input.nextLine();

        MovieInfo mov = new MovieInfo();
        mov.searchForDirector(name);
        mainMain();
    }

    public void ratingsDesc() {
        System.out.println("List of ratings by descending order:");
        MovieInfo mov = new MovieInfo();
        mov.ratingsDesc();
        mainMain();
    }

    public void ratingsAsc() {
        System.out.println("List of ratings by ascending order:");
        MovieInfo mov = new MovieInfo();
        mov.ratingsAsc();
        mainMain();
    }

    public void writeToCSV() {
        input = new Scanner(System.in);
        System.out.println("Write to a new file? Y/N");
        String answer = input.next();

        if (answer.equalsIgnoreCase("y")) {
            WriteToCSV writer = new WriteToCSV();
            writer.convertToCSV();
            System.out.println("Process completed");
        } else {
            System.out.println("Did not succeed, try again");
        }
        mainMain();
    }
}