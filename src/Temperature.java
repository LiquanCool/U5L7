public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    public Temperature(double h, double l, String s)
    {
        highTemp = h;
        lowTemp = l;
        tempScale = s;
        if (!s.equals("C")&&!s.equals("F"))
        {
            tempScale = "F";
        }
    }

    public static double convertCtoF(double temp)
    {
        return (temp*9/5)+32;
    }

    public static double convertFtoC(double temp)
    {
        return (temp-32)*5/9;
    }

    public void changeToC()
    {
        if (tempScale.equals("F"))
        {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }

    public void changeToF()
    {
        if (tempScale.equals("C"))
        {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    public static double roundToNearestTenth(double num)
    {
        return (double)Math.round((num)*10)/10;
    }

    public String toString()
    {
        return "High Temperature :" + roundToNearestTenth(highTemp) + " " + tempScale
                +"\nLow Temperature : " + roundToNearestTenth(lowTemp) + " " + tempScale;
    }

}
