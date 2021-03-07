import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squirrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squirrel extends Actor
{
    /**
     * Act - do whatever the Squirrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int gravity;
    private static final int acceleration = 2;      
    private static final int speed = 10;             
    private static final int jumpStrength = 25;
    
    public void act() 
    {
        
        {GreenfootImage squirrel = new GreenfootImage("squirrel.png");
            squirrel.scale(squirrel.getWidth()/2, squirrel.getHeight()/2);
            setImage(squirrel);
        }
        run();
    }    
    
    
    public void run(){
        setLocation(getX() - speed, getY());
        
    }
}
