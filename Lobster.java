import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * CRAB POPULATION OVERFLOW. INTRODUCING INVASIVE PREDAOTOR. 
 * 
 * Riz.
 * 03.15.21
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        move(5);
        lookForCrab();
        randomTurn();
    }
    
    public void turnAtEdge()
    {
        if (isAtEdge()) 
        {
            turn((int)(Math.random() * (100)));
        }
    }
    
    public void lookForCrab()
    {
         if(isTouching(Crab.class))
        {
               removeTouching(Crab.class);
               Greenfoot.playSound("clap.wav");
               Greenfoot.stop();
        }  
    }
    
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
    }
    
    public void move( )
    {
        move(5);
    }  
}
