import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    { 
        lookForWorm();
        checkKeyPress();
        move(5);
        int x = getX();
        int y = getY();
        System.out.println(x + "," + y);
    }
    
    public void lookForWorm()
    {
         if(isTouching(Worm.class))
        {
               removeTouching(Worm.class);
               Greenfoot.playSound("slurp.wav");
        }  
    }

    
    public void move( )
    {
        move(5);
    }
    
    public void checkKeyPress() 
    {
           if (Greenfoot.isKeyDown("left"))
        {
                turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
                turn(4);
        }
    }
    
}


