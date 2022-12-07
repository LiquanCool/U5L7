import java.util.Locale;

public class RaceUtility {
    public static double milesToKm(double miles)
    {
        return miles*1.609344;
    }

    public static double kmToMiles(double km)
    {
        return km*0.62137119;
    }

    public static String makeProper(String str)
    {
        String newString = "";
        newString = newString + str.substring(0,1).toUpperCase();
        for (int i = 1; i < str.length(); i++)
        {
            if (str.substring(i-1,i).equals(" "))
            {
                newString = newString + str.substring(i,i+1).toUpperCase();
            }
            else
            {
                newString = newString + str.substring(i,i+1).toLowerCase();
            }
        }
        return newString;
    }
}
