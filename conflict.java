public class conflict
{
    private String  type;
    private int     participants;// Kevin is an idiot
    private boolean solved;
    private String Test;
    private int Testnummer;
    
    public String getType()
    {
        return type;
    }
    
    public int getParticipants()
    {
        return participants;
    }
    
    public boolean getSolved()
    {
        return solved;
    }

    public conflict(String neuType, int neuIdiots, boolean neuSolved)
    {
        type = neuType;
        participants = neuIdiots;
        solved = neuSolved;
    }
}