import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage image = new GreenfootImage("pixil-frame-0.png");
        
        image.scale(500, 500);
        setBackground( image);
        addObject(new Runner(), 135, 266);
        addObject(new Rock(), 14,315);
        
        
        
        
        
    }
}
