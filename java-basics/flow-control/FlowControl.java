class FlowControl {
    public static void main(String[] args) {
        /*
         * Simple If
         */

        int age = 18;
        if (age > 18) {
            System.out.println("Eligible to vote");
        }

        /*
         * If Else
         */

        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }

        /*
         * If Else ladder
         */
        int number = 10;

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("ZERO");
        }

        int marks = 55;
        if (marks < 35) {
            System.out.println("Failed");
        } else if (marks >= 35 && marks <= 50) {
            System.out.println("Grade E");
        } else if (marks > 50 && marks < 65) {
            System.out.println("Grade D");
        } else if (marks >= 65 && marks < 75) {
            System.out.println("Grade C");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade A");
        }

        /*
         * Nested If
         */
        int weight = 50;
        if (age > 18) {
            if (weight > 50) {
                System.out.println("You can donate blood");
            } else {
                System.out.println("You don't have proper weight to donate blood");
            }
        } else {
            System.out.println("You don't have proper age to donate blood");
        }

        /*
         * Switch
         */
        int x = 0;
        switch (x) {
        case 0:
            System.out.println("0");
            break;
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        default:
            System.out.println("default");
        }

        /*
         * Ternary operator
         */
        System.out.println(age > 18 ? "Eligible to vote" : "Not Eligible to vote");

        /*
         * while loop
         */
        number = 10;
        while (number > 0) {
            System.out.println("Number from while: " + number);
            number--;
        }

        /*
         * do-while loop
         */
        number = 10;
        do {
            System.out.println("Number from do-while: " + number);
            number--;
        } while (number > 0);

        /*
         * for loop
         */
        number = 10;
        for (int i = number; i > 0; i--) {
            System.out.println("Number from for : " + i);
        }

        /*
         * for-each loop
         */
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : numbers) {
            System.out.println("Number from for-each: " + i);
        }

        /*
         * break loop
         */
        for (int i : numbers) {
            if (i == 5)
                break;
            System.out.println("Number before break: " + i);
        }

        /*
         * continue loop
         */
        for (int i : numbers) {
            if (i == 5)
                continue;
            System.out.println("Number unskipped by continue : " + i);
        }

        /*
         * return from loop
         */
        for (int i : numbers) {
            if (i == 5)
                return;
            System.out.println("Number unskipped by return: " + i);
        }
    }
}