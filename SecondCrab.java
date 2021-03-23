import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class SecondCrab extends Actor
{
    
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    int wormsEaten;
    int timeToSwitchImage;
      
    public SecondCrab() {
        
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);

    }
    
    public void act()
    { 
        lookForWorm();
        checkKeyPress();
        move(5);
        switchImage();
    }
    
    public void lookForWorm()
    {
         if(isTouching(Worm.class))
        {
               removeTouching(Worm.class);
               Greenfoot.playSound("slurp.wav");
               
               wormsEaten = wormsEaten + 1;
               
                if (wormsEaten == 8) {
                    Greenfoot.playSound("fanfare.wav");
                    Greenfoot.stop();
                }
               
        }  
    }

    
    public void move( )
    {
        move(5);
    }
    
    public void checkKeyPress() 
    {
           if (Greenfoot.isKeyDown("a"))
        {
                turn(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
                turn(4);
        }
    }
    
    public void switchImage() 
    {
        if(timeToSwitchImage >= 6) {
            
            if(getImage() == image1) {
                 setImage(image2);
                } else {
                 setImage(image1);
                 timeToSwitchImage = 0;
                }
                
            }
        timeToSwitchImage++;
    }
    
    
}
