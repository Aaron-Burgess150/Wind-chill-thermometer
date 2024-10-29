import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Optional extra practice (Wind Chill Temp)
    System.out.println("Enter outside temperature (between -58 and 41 F): "); //prompt
    //Scanner input = new Scanner(System.in); //allows for user input
    double outsideTemp = input.nextDouble(); //user input
    System.out.println("Enter windspeed (above or equal to 2 mph"); //prompt
    double windSpeed = input.nextDouble(); //user input
    double trueWindSpeed = Math.pow(windSpeed, 0.16); //exponent

    double windChillTemp = 35.74 + (0.6215 * outsideTemp) - (35.75 * (trueWindSpeed)) + (0.4275 * outsideTemp * (trueWindSpeed)); //windchill temp
    System.out.println("The wind chill temperature is " +windChillTemp); //result
  }
}
