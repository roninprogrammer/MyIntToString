public class Main {

    /**
     * Author Name : vicknesh balasubramaniam
     * Requirement:
     * 1. return an empty string if value is negative
     * 2. return an empty string if the conversation fails
     * 3. return the proper string of the value using character '0' to '9' and 'A' to 'F'
     */

    public Main(){}

    public String MyIntToString(int value, int numbase){
      return
    }


    public static void main(String[] args) {
        // write the code here
        System.out.println("********************************************************************");
        System.out.println("*   Java Pre Screen Test: convert an integer to a string in java   *");
        System.out.println("********************************************************************");

        // calling the class
        Main mn = new Main();
        String output = "";

        // sample value and numbase
        output = mn.MyIntToString(254, 16);
        System.out.println(output);

        output = mn.MyIntToString(254, 8);
        System.out.println(output);

        output = mn.MyIntToString(254, 2);
        System.out.println(output);

        // requirement 1 : return an empty string if value is negative
        output = mn.MyIntToString(-9, 16);
        System.out.println(output);

        // requirement 2 : return an empty string if the conversation fails
        output = mn.MyIntToString(10000, 17);
        System.out.println(output);
    }
}
