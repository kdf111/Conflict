public class conflict
{
    private String  type;
    private int     participants;// Kevin is an idiot
    private boolean solved;
    private String Test;

    public conflict(String newType, int newParticipants, boolean newSolved)
    {
        setType(newType);
        setParticipants(newParticipants);
        setSolved(newSolved);
    }    
    
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
    
    public void setType(String newType)
    {
        type = newType;
    }
    
    public void setParticipants(int newParticipants)
    {
        participants = newParticipants;
    }
    
    public void setSolved(boolean newSolved)
    {
        solved = newSolved;
    }
}