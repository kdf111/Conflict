public class conflict
{
    private String  type;
    private int     idiots;
    private boolean solved;
    
    public String getType()
    {
        return type;
    }
    
    public int getParticipants()
    {
        return idiots;
    }
    
    public boolean getSolved()
    {
        return solved;
    }

    public conflict(String neuType, int neuIdiots, boolean neuSolved)
    {
        type = neuType;
        idiots = neuIdiots;
        solved = neuSolved;
    }
    
}