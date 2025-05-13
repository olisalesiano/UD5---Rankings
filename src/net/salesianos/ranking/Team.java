package net.salesianos.ranking;

public class Team {
    private String name;
    private String country;
    private int foundationYear;
    private int rating;

    public Team(String name, String country, int foundationYear, int rating) {
        this.name = name;
        this.country = country;
        this.foundationYear = foundationYear;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " (" + country + ") - Fundado en " + foundationYear + " - Puntuación: " + rating;
    }
}