package com.main;

/**
* The RulerDrawer class implements methods that
* allow to draw a ruler in console with given length and and number of recurencies.
*
* @author  https://stackoverflow.com/questions/25954584/how-to-print-this-horizontally
* @version 1.0
* @since   2020-04-14 
*/

public class RulerDrawer {
	
/** 
 * This method draw tick without label	
 * @param tickLength
 */
	public static void drawOneTick(int tickLength) 
	{
        drawOneTick(tickLength, -1);
    }
/**
 * This method draw one tick and if its line with label ,draws label too
 * @param tickLength
 * @param tickLabel
 */
    public static void drawOneTick(int tickLength, int tickLabel) 
    {
        for (int i = 0; i < tickLength; i++)
        {
            System.out.print("--");
        }
        if (tickLabel >= 0)
        {
        	System.out.print(" " + tickLabel);
        }            
        System.out.print("\n");
    }
/**
 * This method draws ticks using recurencies.
 * @param tickLength
 */
    public static void drawTicks(int tickLength) 
    {
        if (tickLength > 0) 
        {
            drawTicks(tickLength-1);
            drawOneTick(tickLength);
            drawTicks(tickLength-1);
        }
    }
/**
 * This is main method drawing ruler with given length and deepnes
 * @param cmNumber
 * @param majorLength
 */
    public static void drawRuler(int cmNumber, int majorLength) 
    {
        drawOneTick(majorLength, 0);
        for (int i = 1; i <= cmNumber; i++) 
        {
            drawTicks(majorLength-1);
            drawOneTick(majorLength, i);
        }
    }
}
