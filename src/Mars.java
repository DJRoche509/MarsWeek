public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String colonyName = "Pologne";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        //Calculating meals that are left
        meals = meals - shipPopulation*.75;
        meals = meals - shipPopulation*.75;

        // Print out the number of meals left
        System.out.println(meals);

        // Increase meals by 50%
        meals *= (1 +.5 );

        // Assign shipPopulation with an additional 5 unit for the newborns
        shipPopulation += 5;

        System.out.println(meals +" ship Pop: "+ shipPopulation);


        /* CONDITIONAL LOVE*/
        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        // Invoke landingCheck and save new value to variable landing
        landing = landingCheck(45);

        // Invoke class object GuessingGame()
        new GuessingGame();

        // Invoke class object MarsExpedition()
        new MarsExpedition();
    }

    /* LOOPING FUNCTION*/
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (minute % 6 == 0) {
                System.out.println("Keep Center "+ minute);
            } else if (minute % 2 == 0) {
                System.out.println("Right "+ minute);
            } else if (minute % 2 == 1) {
                System.out.println("Left "+ minute);
            } else {
                System.out.println("Calculating "+ minute);
            }
            // Slow Down the console on each loop
            Thread.sleep(250);
        }
            // Log out
        System.out.println("Landed");
        return false;
    }
}
