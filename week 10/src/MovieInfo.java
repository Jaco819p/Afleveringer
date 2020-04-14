import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieInfo {

    String color;
    String directorName;
    String numOfCritics;
    String duration;
    String dirFBLikes;
    String act3FBLikes;
    String act2Name;
    String act1FBLikes;
    String grossIncome;
    String genres;
    String actorName;
    String movieName;
    String totalVotes;
    String totalFBLikesCast;
    String actor3Name;
    String numberFacesPoster;
    String plotKeywords;
    String imdbLink;
    String numberUserReviews;
    String language;
    String country;
    String contentRating;
    String budget;
    String year;
    String act2FBLikes;
    String imdbScore;
    String aspectRatio;
    String movieFBLikes;

    public MovieInfo() {
    }

    public MovieInfo(String color, String directorName, String numOfCritics, String duration, String dirFBLikes, String act3FBLikes, String act2Name, String act1FBLikes, String grossIncome, String genres, String actorName, String movieName, String totalVotes, String totalFBLikesCast, String actor3Name, String numberFacesPoster, String plotKeywords, String imdbLink, String numberUserReviews, String language, String country, String contentRating, String budget, String year, String act2FBLikes, String imdbScore, String aspectRatio, String movieFBLikes) {
        this.color = color;
        this.directorName = directorName;
        this.numOfCritics = numOfCritics;
        this.duration = duration;
        this.dirFBLikes = dirFBLikes;
        this.act3FBLikes = act3FBLikes;
        this.act2Name = act2Name;
        this.act1FBLikes = act1FBLikes;
        this.grossIncome = grossIncome;
        this.genres = genres;
        this.actorName = actorName;
        this.movieName = movieName;
        this.totalVotes = totalVotes;
        this.totalFBLikesCast = totalFBLikesCast;
        this.actor3Name = actor3Name;
        this.numberFacesPoster = numberFacesPoster;
        this.plotKeywords = plotKeywords;
        this.imdbLink = imdbLink;
        this.numberUserReviews = numberUserReviews;
        this.language = language;
        this.country = country;
        this.contentRating = contentRating;
        this.budget = budget;
        this.year = year;
        this.act2FBLikes = act2FBLikes;
        this.imdbScore = imdbScore;
        this.aspectRatio = aspectRatio;
        this.movieFBLikes = movieFBLikes;
    }

    public static Comparator<MovieInfo> movieInfoComparator = new Comparator<>() {

        public int compare(MovieInfo info1, MovieInfo info2) {
            String Year1 = info1.getYear();
            String Year2 = info2.getYear();
            return Year2.compareTo(Year1);
        }};

    public void printFour() {
        ReadFromCSV filler = new ReadFromCSV();
        ArrayList<MovieInfo> print4 = filler.readFromCSV();
        Print print = new Print();

        Collections.sort(print4, MovieInfo.movieInfoComparator);

        System.out.println("Director \t\t\t\t Lead Actor \t\t\t\t Year \t\t\t\t Movie Name");
        System.out.println();
        for (int i = 0; i < print4.size()-1; i++) {

            int length1 = print4.get(i).getDirectorName().length();
            int length2 = print4.get(i).getActorName().length();
            int length3 = print4.get(i).getYear().length();


            if (length1 > 0 && length1 <= 5) {
                System.out.print(print4.get(i).getDirectorName() + fiveTabs());
                if (length2 > 0 && length2 <= 5) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 5 && length2 <= 11) {
                    System.out.print(print4.get(i).getActorName() + fourTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 11 && length2 <= 15) {
                    System.out.print(print4.get(i).getActorName() + threeTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 15 && length2 <= 18) {
                    System.out.print(print4.get(i).getActorName() + twoTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 18 ) {
                    System.out.print(print4.get(i).getActorName() + oneTab());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                }
            } else if (length1 > 5 && length1 <= 11) {
                System.out.print(print4.get(i).getDirectorName() + fourTabs());
                if (length2 > 0 && length2 <= 5) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 5 && length2 <= 12) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 12 && length2 <= 15) {
                    System.out.print(print4.get(i).getActorName() + threeTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 15 && length2 <= 18) {
                    System.out.print(print4.get(i).getActorName() + twoTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 18 ) {
                    System.out.print(print4.get(i).getActorName() + oneTab());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                }
            } else if (length1 > 11 && length1 <= 15) {
                System.out.print(print4.get(i).getDirectorName() + threeTabs());

                if (length2 > 0 && length2 <= 5) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 5 && length2 <= 12) {
                    System.out.print(print4.get(i).getActorName() + fourTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 12 && length2 <= 15) {
                    System.out.print(print4.get(i).getActorName() + fourTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 15 && length2 <= 17) {
                    System.out.print(print4.get(i).getActorName() + threeTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 17 ) {
                    System.out.print(print4.get(i).getActorName() + twoTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                }
            } else if (length1 > 15 && length1 <= 18) {
                System.out.print(print4.get(i).getDirectorName() + twoTabs());
                if (length2 > 0 && length2 <= 5) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 5 && length2 <= 11) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 11 && length2 <= 15) {
                    System.out.print(print4.get(i).getActorName() + threeTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 15 && length2 <= 18) {
                    System.out.print(print4.get(i).getActorName() + twoTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 18 ) {
                    System.out.print(print4.get(i).getActorName() + oneTab());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                }
            } else if (length1 > 18) {
                System.out.println(print4.get(i).getDirectorName() + oneTab());
                if (length2 > 0 && length2 <= 5) {
                    System.out.print(print4.get(i).getActorName() + fiveTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 5 && length2 <= 11) {
                    System.out.print(print4.get(i).getActorName() + fourTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 11 && length2 <= 15) {
                    System.out.print(print4.get(i).getActorName() + threeTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 15 && length2 <= 18) {
                    System.out.print(print4.get(i).getActorName() + twoTabs());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                } else if (length2 > 18 ) {
                    System.out.print(print4.get(i).getActorName() + oneTab());
                    System.out.print(print4.get(i).getYear() + fourTabs());
                    System.out.println(print4.get(i).getMovieName());
                }
            }

        }

    }

    private String oneTab() {
        return "\t ";
    }

    private String twoTabs() {
        return "\t\t ";
    }

    private String threeTabs() {
        return "\t\t\t ";
    }

    private String fourTabs() {
        return "\t\t\t\t ";
    }

    private String fiveTabs() {
        return "\t\t\t\t\t ";
    }

        public String getDirectorName() {
        return directorName;
    }

    public String getActorName() {
        return actorName;
    }

    public String getMovieName() {
        return movieName;
    }



    public String getYear() {
        return year;

    }

    @Override
    public String toString() {
        return this.directorName + " " + this.actorName + " " + this.movieName + " " + this.imdbScore;
    }

}