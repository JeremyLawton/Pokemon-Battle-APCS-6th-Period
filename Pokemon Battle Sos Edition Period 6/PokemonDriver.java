import java.util.Random;
public class PokemonDriver
{
  public static void main(String args[])
  {
    GUI.main();
    
    Random randomizer = new Random();
    //decide who goes first
    int first = randomizer.nextInt(2);
    
  }
}
