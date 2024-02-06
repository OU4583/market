//Michael Appiah
//Oscar Umana
public class Stars
{
    private String team;
    private String name;
    private int value;

    public Stars(String team, String name, int value)
    {
        this.team = team;
        this.name = name;
        this.value = value;
    }
    

    public String getTeam()
    {
        return team;
    }
    public String getName()
    {
        return name;
    }
    public int getValue()
    {
        return value;
    }
    public void setTeam(String t)
    {
        team = t;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setValue(int v)
    {
        value = v;
    }
    
    public String toString()
    {
        return "\nTeam: " + getTeam() + "\nname:"+ getName() + "\nValue: "+ getValue();
    }
}
