public class Runner
{
    public static void convert(double miles, double km)
    {
        System.out.println(RaceUtility.milesToKm(miles));
        System.out.println(RaceUtility.kmToMiles(km));
    }

    public static void capitalize(String str)
    {
        System.out.println(RaceUtility.makeProper(str));
    }
    public static void main(String[] args)
    {
        convert(13.85,40);
        convert(26.42,3.5);
        convert(5, 20.50);
        convert(0,0);
        capitalize("welcome to the marathon!");
        capitalize("It's TIME for THE 5k!");
        capitalize("runners, take your marks...");
        capitalize("2 MILES TO GO!");
        capitalize("water break in 0.5 miles");
    }
}
