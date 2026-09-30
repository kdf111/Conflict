public class conflict
{
    private String  type;
    private int     participants;
    private boolean solved;
    
    public conflict(String neuType, int neuParticipants, boolean neuSolved)
    {
        type = neuType;
        participants = neuParticipants;
        solved = neuSolved;
    }
}