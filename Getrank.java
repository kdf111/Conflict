public class Getrank
{
    private String  name;
    private boolean alcohol;
    private int     mililiter;
    private boolean bottled;
    private boolean deposit;
    
    public String getName()
    {
        return name;
    }
    
    public boolean getAlcohol()
    {
        return alcohol;
    }
    
    public int getMililiter()
    {
        return mililiter;
    }
    
    public boolean getBottled()
    {
        return bottled;
    }
    
    public boolean getDeposit()
    {
        return deposit;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setMililiter(int newMililiter)
    {
        if(200<newMililiter && newMililiter<1000)
        {
            mililiter = newMililiter;
        }
        else
        {
            System.out.println("mililiter not supported");
        }
            
    }
    
    public void printGetrank()
    {
        /*
         * printing Getrank like:
         * Getraenk: Beer, 500ml
         */
        System.out.println("Getraenk:" + name + "," + mililiter + "ml");
    }
}