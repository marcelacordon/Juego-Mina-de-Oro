import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tall extends Piso
{
    /**
     * Act - do whatever the Tall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //se creo un constructor para establecer sus medidas antes de colocarlos en el mundo 
    public Tall(int width, int height)
    {
        getImage().scale(width, height);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
