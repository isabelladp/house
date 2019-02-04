
/**
 * Write a description of class myPicture here.
 *
 * @author (Isabella Reinn Dela Pena)
 * @version (2.4.19)
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
    private Circle sunRay5;
    private Circle sunRay6;
    private Circle sunRay7;
    private Circle sunRay8;
    private Circle sunRay9;
    private Circle sunRay10;
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
        sunRay5 = new Circle();
        sunRay6 = new Circle();
        sunRay7 = new Circle();
        sunRay8 = new Circle();
        sunRay9 = new Circle();
        sunRay10 = new Circle();
        drawn = false;
    }
    
      public void draw()
    {
        if(!drawn) 
        {   
            sunRay10.changeColor("red");
            sunRay10.moveHorizontal(0);
            sunRay10.moveVertical(-130);
            sunRay10.changeSize(390);
            sunRay10.makeVisible();
            
            sunRay9.changeColor("white");
            sunRay9.moveHorizontal(12);
            sunRay9.moveVertical(-120);
            sunRay9.changeSize(360);
            sunRay9.makeVisible();
            
            sunRay8.changeColor("red");
            sunRay8.moveHorizontal(24);
            sunRay8.moveVertical(-110);
            sunRay8.changeSize(330);
            sunRay8.makeVisible();
            
            sunRay7.changeColor("white");
            sunRay7.moveHorizontal(36);
            sunRay7.moveVertical(-100);
            sunRay7.changeSize(300);
            sunRay7.makeVisible();
            
            sunRay6.changeColor("red");
            sunRay6.moveHorizontal(48);
            sunRay6.moveVertical(-90);
            sunRay6.changeSize(270);
            sunRay6.makeVisible();
            
            sunRay5.changeColor("white");
            sunRay5.moveHorizontal(60);
            sunRay5.moveVertical(-80);
            sunRay5.changeSize(240);
            sunRay5.makeVisible();
            
            sunRay4.changeColor("red");
            sunRay4.moveHorizontal(72);
            sunRay4.moveVertical(-70);
            sunRay4.changeSize(210);
            sunRay4.makeVisible();
            
            sunRay3.changeColor("white");
            sunRay3.moveHorizontal(84);
            sunRay3.moveVertical(-60);
            sunRay3.changeSize(180);
            sunRay3.makeVisible();
            
            sunRay2.changeColor("red");
            sunRay2.moveHorizontal(96);
            sunRay2.moveVertical(-50);
            sunRay2.changeSize(150);
            sunRay2.makeVisible();
            
            sunRay.changeColor("white");
            sunRay.moveHorizontal(108);
            sunRay.moveVertical(-40);
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
