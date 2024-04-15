import java.io.FileWriter;
import java.io.IOException;

public class Poem {
    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }

    public static void main(String[] args) {
        Poem poem1 = new Poem();
        poem1.name = "Kindness";
        poem1.poet = "Naomi Shihab Nye";

        Poem poem2 = new Poem();
        poem2.name = "A Line-storm Song";
        poem2.poet = "Robert Frost";

        Poem poem3 = new Poem();
        poem3.name = "The Weary Blues";
        poem3.poet = "Langston Hughes";

        try (FileWriter fw = new FileWriter("src/poems.txt")) {
            fw.write(String.valueOf(poem1));
            fw.write(String.valueOf(poem2));
            fw.write(String.valueOf(poem3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }
}