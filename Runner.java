import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Actor
{
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int gravity;
    private static final int acceleration = 2;      
    private static final int speed = 1;             
    private static final int jumpStrength = 25;

    private int vSpeed = 0;
    public Runner(){
        this.gravity = 100;

        {
            GreenfootImage michael1 = new GreenfootImage("michaelRun.png");
            michael1.scale(michael1.getWidth()/2, michael1.getHeight()/2);
            setImage(michael1);
        }
    }

    public void act() 
    {
        checkKeys();
        checkFall();
        
    }    

    private void checkKeys()
    {

        if (Greenfoot.isKeyDown("space") )
        {
            if (onGround())
                jump();
        }
    }     

    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    } 

    private boolean atBottom()
    {
        return getY() >= getWorld().getHeight() - 2;
    }

    private void gameEnd()
    {
        Greenfoot.stop();
    }

    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if ( atBottom() )
            gameEnd();
    }

    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }  

    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    } 

    public void checkForJump(){
        if (Greenfoot.isKeyDown("space") )
        {
            if (onGround())
                jump();
        }
    }
    
    
    public boolean onGround(){
        if ((getX()==135)&&(getY()==266))
            return true;
        else 
            return false;
    }
}
