public class Celebrity
{
    private String name;
    private String clue;

    public Celebrity(String name, String clue)
    {
        this.name = name;
        this.clue = clue;
    }
    public String getName() { return name; }
    public String getClue() { return clue; }
    @Override
    public String toString()
    {
        return "The celebrity's name is " + name + " and their clue is " + clue;
    }
}
