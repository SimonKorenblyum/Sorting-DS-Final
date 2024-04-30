/**
 * Emily D'Alba
 */
import java.util.*;
public class arrCreator 
{
    /**
     * creates array or randomized ints
     * @param size size of array
     * @return array of randomized ints 
     */
    public static int [] intArrR(int size)
    {
        int [] arr = new int [size]; //creates array with designated size
        Random rInt = new Random(); //to get random ints
        for(int i = 0; i < size; i++) //itterates through assigning random ints
        {
            arr[i] = rInt.nextInt(); //assigning random ints 
        }
        return arr; //returns array
    }

    /**
     * creates array or randomized doubles
     * @param size size of array
     * @return array of randomized doubles 
     */
    public static double [] doubleArrR(int size)
    {
        double [] arr = new double [size]; // creates array with designated size
        Random rDouble = new Random(); //to get random double
        for(int i = 0; i < size; i++) //itterates through assigning random doubles
        {
            arr[i] = rDouble.nextDouble(); //assigning random doubles
        }
        return arr; //returning array of randomized doubles
    }

    /**
     * creates array of randomized strings with length of 7
     * @param size size of array
     * @return array of randomized strings with length of 7
     */
    public static String [] stringArrR(int size)
    {
        String [] arr = new String[size]; //creates string array of designated size 
        for(int i = 0; i < size; i++) //itterates through assigning randomized strings 
        {
            arr[i] = randomString(); //assigning randomized strings 
        }
        return arr; //returning strings
    }

    /**
     * creates random string with length of 7 to be put in String array
     * @return
     */
    public static String randomString()
    {
        String returning = ""; //creates string
        Random num = new Random(); //for randomly selecting char
        for(int i = 0; i < 7; i++)
        {
            returning = getLetter(num.nextInt(25)) + returning; //adds randomly selected char to front of string
        }
        return returning; //returns random string
    }

    /**
     * gets random letter for random string
     * @param number randomized number to select the character at the location of randomized number
     * @return char at randomized position
     */
    public static char getLetter(int number)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //creates alphabet to select letter from
        return alphabet.charAt(number); //retrun char at position of alphabet
    }


    public static void main (String [] ars)
    {
        String [] arr = stringArrR(10);

        for(int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println(randomString());
    }
}
