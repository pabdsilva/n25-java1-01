import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da classe BeeWorld.
 * 
 * @author Pablo Silva 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,31,30);
        Abelha abelha = new Abelha();
        addObject(abelha,44,151);
        Mosca mosca = new Mosca();
        addObject(mosca,31,330);
        mosca.setLocation(21,263);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,103,266);
        mosca2.setLocation(105,257);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,80,324);
        mosca3.setLocation(82,328);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,33,374);
        mosca.setLocation(26,264);
        mosca.setLocation(24,268);
        mosca.setLocation(23,267);
        mosca.setLocation(31,268);
    }
}
