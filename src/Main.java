public class Main {

    /**
     * Author Name : vicknesh balasubramaniam
     * Requirement:
     * 1. return an empty string if value is negative
     * 2. return an empty string if the conversion fails
     * 3. return the proper string of the value using character '0' to '9' and 'A' to 'F'
     */

    public Main(){
        //An empty constructor is needed to create a new instance via reflection by your persistence framework. If you don't provide any additional constructors with arguments for the class, you don't need to provide an empty constructor because you get one per default.
    }

    public String GetString(int abc){
        String returnString = " ";
        switch (abc) {
            case 0:
                returnString = String.valueOf(0);
                break;
            case 1:
                returnString = String.valueOf(1);
                break;
            case 2:
                returnString = String.valueOf(2);
                break;
            case 3:
                returnString = String.valueOf(3);
                break;
            case 4:
                returnString = String.valueOf(4);
                break;
            case 5:
                returnString = String.valueOf(5);
                break;
            case 6:
                returnString = String.valueOf(6);
                break;
            case 7:
                returnString = String.valueOf(7);
                break;
            case 8:
                returnString = String.valueOf(8);
                break;
            case 9:
                returnString = String.valueOf(9);
                break;
            case 10:
                returnString = ("A");
                break;
            case 11:
                returnString = ("B");
                break;
            case 12:
                returnString = ("C");
                break;
            case 13:
                returnString = ("D");
                break;
            case 14:
                returnString = ("E");
                break;
            case 15:
                returnString = ("F");
                break;
        }
        return returnString;

    }
    public String MyIntToString(int value, int numbase){
      // REMEMBER Code rule : String.valueOf() IS NOT ALLOWED - which most trickiest since java has build in method to solve this yet requirement say so lets Reinventing the wheel
      // You shall not declare abt additional using directive other than "using system" - so no java.text.decimalformat
      // using Helper class - let divide function by conversion & calling input
      // let's start with understanding the value and numbase
      // value is a 32 bit signed integer and numbase is any value between and 2 and 16.

       String alphanumeric="";
       // if numbase is any number of 2 - 16
       //convert the int to String
       switch(numbase){
           case 16:
               int resultInt16;
               String resultString16 = " ";
               int tempvalue16 = value;
               while (tempvalue16 > 0) {
                   resultInt16 = tempvalue16 % 16;
                   tempvalue16 /= 16;
                   resultString16 = GetString(resultInt16) + resultString16;
               }
               alphanumeric = resultString16;
               break;
           case 15:
               int resultInt15;
               String resultString15 = "";
               int tempvalue15 = value;
               while (tempvalue15 > 0) {
                   resultInt15 = tempvalue15 % 15;
                   tempvalue15 /= 15;
                   resultString15 = GetString(resultInt15) + resultString15;
               }
               alphanumeric = resultString15;
               break;
           case 14:
               int resultInt14;
               String resultString14 = "";
               int tempvalue14 = value;
               while (tempvalue14 > 0) {
                   resultInt14 = tempvalue14 % 14;
                   tempvalue14 /= 14;
                   resultString14 = GetString(resultInt14) + resultString14;
               }
               alphanumeric = alphanumeric;
               break;
           case 13:
               int resultInt13;
               String resultString13 = "";
               int tempvalue13 = value;
               while (tempvalue13 > 0) {
                   resultInt13 = tempvalue13 % 13;
                   tempvalue13 /= 13;
                   resultString13 = GetString(resultInt13) + resultString13;
               }
               alphanumeric = resultString13;
               break;
           case 12:
               int resultInt12;
               String resultString12 = "";
               int tempvalue12 = value;
               while (tempvalue12 > 0) {
                   resultInt12 = tempvalue12 % 12;
                   tempvalue12 /= 12;
                   resultString12 = GetString(resultInt12) + resultString12;
               }
               alphanumeric = resultString12;
               break;
           case 11:
               int resultInt11;
               String resultString11 = "";
               int tempvalue11 = value;
               while (tempvalue11 > 0) {
                   resultInt11 = tempvalue11 % 12;
                   tempvalue11 /= 12;
                   resultString11 = GetString(resultInt11) + resultString11;
               }
               alphanumeric = resultString11;
               break;
           case 10:
               int resultInt10;
               String resultString10 = "";
               int tempvalue10 = value;
               while (tempvalue10 > 0) {
                   resultInt10 = tempvalue10 % 10;
                   tempvalue10 /= 10;
                   resultString10 = GetString(resultInt10) + resultString10;
               }
               alphanumeric = resultString10;
               break;
           case 9:
               int resultInt9;
               String resultString9 = "";
               int tempvalue9 = value;
               while (tempvalue9 > 0) {
                   resultInt9 = tempvalue9 % 9;
                   tempvalue9 /= 9;
                   resultString9 = GetString(resultInt9) + resultString9;
               }
               alphanumeric = resultString9;
               break;
           case 8:
               int resultInt8;
               String resultString8 = "";
               int tempvalue8 = value;
               while (tempvalue8 > 0) {
                   resultInt8 = tempvalue8 % 8;
                   tempvalue8 /= 8;
                   resultString8 = GetString(resultInt8) + resultString8;
               }
               alphanumeric = resultString8;
               break;
           case 7:
               int resultInt7;
               String resultString7 = "";
              int tempvalue7 = value;
               while (tempvalue7 > 0) {
                   resultInt7 = tempvalue7 % 7;
                   tempvalue7 /= 7;
                   resultString7 = GetString(resultInt7) + resultString7;
               }
               alphanumeric = resultString7;
               break;
           case 6:
               int resultInt6;
               String resultString6 = "";
               int tempvalue6 = value;
               while (tempvalue6 > 0) {
                   resultInt6 = tempvalue6 % 6;
                   tempvalue6 /= 6;
                   resultString6 = GetString(resultInt6) + resultString6;
               }
               alphanumeric = resultString6;
               break;
           case 5:
               int resultInt5;
               String resultString5 = "";
               int tempvalue5 = value;
               while (tempvalue5 > 0) {
                   resultInt5 = tempvalue5 % 5;
                   tempvalue5 /= 5;
                   resultString5= GetString(resultInt5) + resultString5;
               }
               alphanumeric = resultString5;
               break;
           case 4:
               int resultInt4;
               String resultString4 = "";
               int tempvalue4 = value;
               while (tempvalue4 > 0) {
                   resultInt4 = tempvalue4 % 4;
                   tempvalue4 /= 4;
                   resultString4 = GetString(resultInt4) + resultString4;
               }
               alphanumeric = resultString4;
               break;
           case 3:
               int resultInt3;
               String resultString3 = "";
               int tempvalue3 = value;
               while (tempvalue3 > 0) {
                   resultInt3 = tempvalue3 % 3;
                   tempvalue3 /= 3;
                   resultString3 = GetString(resultInt3) + resultString3;
               }
               alphanumeric = resultString3;
               break;
           case 2:
               int resultInt2;
               String resultString2 = "";
               int tempvalue2 = value;
               while (tempvalue2 > 0) {
                   resultInt2 = tempvalue2 % 2;
                   tempvalue2 /= 2;
                   resultString2 = GetString(resultInt2) + resultString2;
               }
               alphanumeric = resultString2;
               break;
            default:
                alphanumeric = "empty String";
                break;
       }
       return alphanumeric;

    }


    public static void main(String[] args) {
        // write the code here
        System.out.println("********************************************************************");
        System.out.println("*    Java Pre Screen Test: convert an integer to a string in java  *");
        System.out.println("********************************************************************");

        // calling the class
        Main mn = new Main();
        String output = "";

        // requirement 1 : return an empty string if value is negative
        output = mn.MyIntToString(-9, 0);
        System.out.println("MyIntToString(-9, 0) return \"empty string\" : " + output + "\n"); // expected output : outputs an empty string

        // requirement 2 : return an empty string if the conversation fails
        output = mn.MyIntToString(254, 4);
        System.out.println("MyIntToString(10000, 17) return \"empty string\" : " + output + "\n"); // expected output  : outputs an empty string

        // Requirement 3 : return the proper string of the value using characer '0' to '9' and 'A' to 'F
        output = mn.MyIntToString(254, 16);
        System.out.println("MyIntToString(254, 16) return \"FE\" : " + output + "\n"); // expected output : FE

        output = mn.MyIntToString(254, 8);
        System.out.println("MyIntToString(254, 8) return \"376\" : " + output + "\n");// expected output : 376

        output = mn.MyIntToString(254, 2);
        System.out.println("MyIntToString(254, 2) return \"11111110\" : " + output + "\n"); // expected output : 11111110

    }
}
