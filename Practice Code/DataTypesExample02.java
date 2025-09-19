 public class DataTypesExample02 {
    public static void main(String[] args) {
        // byte: small range, e.g., someone's age
        //Stores whole numbers from -128 to 127
        byte age = 25;

        // short: medium range, e.g., number of students in a college
        //Stores whole numbers from -32,768 to 32,767
        short students = 3200;

        // int: common range, e.g., population of a city
        //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int cityPopulation = 500000;

        // long: very large range, e.g., world population
        //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long worldPopulation = 8000000000L;

        // float: decimal with smaller precision, e.g., body temperature
        //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float temperature = 36.6f;

        // double: decimal with higher precision, e.g., bank account balance
        //Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        double accountBalance = 1234567.89;

        // boolean: true/false, e.g., is today Sunday?
        boolean isSunday = false;

        // char: 	Stores a single character/letter or ASCII values, e.g., blood group
        
        char bloodGroup = 'O';

        // Print all the values
        System.out.println("Age: " + age);
        System.out.println("Students in College: " + students);
        System.out.println("City Population: " + cityPopulation);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Body Temperature: " + temperature);
        System.out.println("Bank Account Balance: " + accountBalance);
        System.out.println("Is today Sunday? " + isSunday);
        System.out.println("Blood Group: " + bloodGroup);
    }
}

