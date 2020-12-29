package movies;

public class Movie {
    private static Object MoviesArray;
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public static void main(String[] args) {
        System.out.println(MoviesArray);
    }
}
