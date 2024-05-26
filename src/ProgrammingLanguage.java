package version_1;

public class ProgrammingLanguage {
    private String name;
    private String owner;
    private String releaseDate;

    public ProgrammingLanguage(String name, String owner, String releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public static void main(String[] args) {
        try {
            ProgrammingLanguage language = new ProgrammingLanguage(null, null, null);
            System.out.println(language.getName());
            System.out.println(language.getOwner());
            System.out.println(language.getReleaseDate());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

