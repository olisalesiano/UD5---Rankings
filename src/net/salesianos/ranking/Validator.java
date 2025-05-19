package net.salesianos.ranking;

public class Validator {
    public static boolean isValidName(String name) {
        return name != null;
    }

    public static boolean isValidCountry(String country) {
        return country != null;
    }

    public static boolean isValidYear(int year) {
        return year > 1800;
    }

    public static boolean isValidRating(int rating) {
        return rating >= 0;
    }
}
