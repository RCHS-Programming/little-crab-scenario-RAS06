import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if (isAtEdge()) 
        {
            turn((int)(Math.random() * (100)));
        }
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        
        move(5);
    }
    
    public void move( )
    {
        move(5);
    }
}


