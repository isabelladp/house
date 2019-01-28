
/**
 * Write a description of class myPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myPicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square ground;
    private Circle sunRay;
    private Circle sunRay2;
    private Circle sunRay3;
    private Circle sunRay4;
    private boolean drawn;

    /**
     * Constructor for objects of class myPicture
     */
    public myPicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        ground = new Square();
        sunRay = new Circle();
        sunRay2 = new Circle();
        sunRay3 = new Circle();
        sunRay4 = new Circle();
        drawn = false;
    }
    
      public void draw()
    {
        if(!drawn) 
        {   
   
            sunRay2.changeColor("red");
            sunRay2.moveHorizontal(80);
            sunRay2.moveVertical(-30);
            sunRay2.changeSize(150);
            sunRay2.makeVisible();
            
            sunRay.changeColor("white");
            sunRay.moveHorizontal(100);
            sunRay.moveVertical(-30);
            sunRay.changeSize(120);
            sunRay.makeVisible();
            
           
            sun.changeColor("red");
            sun.moveHorizontal(120);
            sun.moveVertical(-30);
            sun.changeSize(95);
            sun.makeVisible();
            
            wall.moveHorizontal(-160);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("black");
            wall.makeVisible();
            
            window.changeColor("white");
            window.moveHorizontal(-140);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.changeColor("black");
            roof.moveHorizontal(0);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            ground.changeSize(600);
            ground.moveVertical(120);
            ground.moveHorizontal(-320);
            ground.changeColor("black");
            ground.makeVisible();
            
            drawn = true;
        }

    } 
    
}
