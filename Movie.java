class Movie
{
    static double getBudget(String movieName)
    {
        if (movieName.equals("KGF"))
        {
            return 100.0;
        }
        else if (movieName.equals("RRR"))
        {
            return 550.0;
        }
        else
        {
            return 0.0;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Budget: " + Movie.getBudget("KGF") + " Crores");
    }
}