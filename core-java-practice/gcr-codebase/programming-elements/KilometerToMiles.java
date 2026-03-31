class KilometerToMiles {
    public static void main(String[] args) {
        double distanceKm = 10.8;
        double milesPerKm = 1.6;

        double distanceMiles = distanceKm * milesPerKm;

        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}