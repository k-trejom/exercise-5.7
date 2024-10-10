java class FinacialApplication {
    public static void main (String[] args) {
        double initialTuition = 10000;
        double rateIncrease = 0.05;
        double tuition = initialTuition;

        for (int i = 1;i <= 10; i++) {
            tuition = tuition * (1 + rateIncrease);
        }
        double tenYears = tuition;
        System.out.printf("Tuition in 10 years: $%.2f%n", tenYears);

        double costFourYears = 0;
        for (int i = 0; i < 4; i++) {
            costFourYears += tuition;
            tuition = tuition * (1 + rateIncrease);
        }
        System.out.printf("Tuition for 4 years: $%.2f%n", costFourYears);

    }
}
//10102024_TrejoKevin_exercise5.7