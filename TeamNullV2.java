package Project00;

public class TeamNullV2 extends Team
{
    public TeamNullV2(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new WillyMember("William Brandes"));
        members.add(new IvesMember("Elijah Ives"));
        members.add(new GooberMember("Dylan Goober"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
