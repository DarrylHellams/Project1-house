/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square background1;
    private Square background2;
    private Square chair1;
    private Square chair2;
    private Square chair3;
    private Square chair4;
    private Square chair5;
    private Square chair6;
    private Square chair7;
    private Square chair8;
    private Square chair9;
    private Square chair10;
    private Square chair11;
    private Square chair12;
    private Person giant;
    private Square staff1;
    private Square staff2;
    private Square staff3;
    private Square staff4;
    private Square staff5;
    private Triangle staff6;
    private Person person1; 
    private Person person2;
    private Person person3;
    private Person person4;
    private Triangle pyramid;
    private Person person5;
    private Person person6;
    private Person person7;
    private Circle sun;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background1 = new Square();
        background1.changeColor("blue");
        background1.moveHorizontal(0);
        background1.moveVertical(-400);
        background1.changeSize(500);
        background1.makeVisible();
        
        background2 = new Square();
        background2.changeColor("sand");
        background2.moveHorizontal(0);
        background2.moveVertical(80);
        background2.changeSize(500);
        background2.makeVisible();

        chair1 = new Square();
        chair1.changeColor("black");
        chair1.changeSize(100);
        chair1.moveHorizontal(-30);
        chair1.moveVertical(260);
        chair1.makeVisible();

        chair2 = new Square();
        chair2.changeColor("black");
        chair2.moveHorizontal(55);
        chair2.moveVertical(260);
        chair2.changeSize(100);
        chair2.makeVisible();
        
        chair3 = new Square();
        chair3.changeColor("black");
        chair3.moveHorizontal(-70);
        chair3.moveVertical(180);
        chair3.changeSize(100);
        chair3.makeVisible();
        
        chair4 = new Square();
        chair4.changeColor("black");
        chair4.moveHorizontal(-70);
        chair4.moveVertical(120);
        chair4.changeSize(100);
        chair4.makeVisible();
        
        chair5 = new Square();
        chair5.changeColor("black");
        chair5.moveHorizontal(30);
        chair5.moveVertical(200);
        chair5.changeSize(20);
        chair5.makeVisible();
        
        chair6 = new Square();
        chair6.changeColor("black");
        chair6.moveHorizontal(50);
        chair6.moveVertical(200);
        chair6.changeSize(20);
        chair6.makeVisible();
        
        chair7 = new Square();
        chair7.changeColor("black");
        chair7.moveHorizontal(70);
        chair7.moveVertical(200);
        chair7.changeSize(20);
        chair7.makeVisible();
        
        chair8 = new Square();
        chair8.changeColor("black");
        chair8.moveHorizontal(90);
        chair8.moveVertical(200);
        chair8.changeSize(20);
        chair8.makeVisible();
        
        chair9 = new Square();
        chair9.changeColor("black");
        chair9.moveHorizontal(110);
        chair9.moveVertical(200);
        chair9.changeSize(20);
        chair9.makeVisible();
        
        chair10 = new Square();
        chair10.changeColor("black");
        chair10.moveHorizontal(110);
        chair10.moveVertical(220);
        chair10.changeSize(20);
        chair10.makeVisible();
        
        chair11 = new Square();
        chair11.changeColor("black");
        chair11.moveHorizontal(110);
        chair11.moveVertical(240);
        chair11.changeSize(20);
        chair11.makeVisible();
        
        chair12 = new Square();
        chair12.changeColor("black");
        chair12.moveHorizontal(-10);
        chair12.moveVertical(100);
        chair12.changeSize(20);
        chair12.makeVisible();
        
        giant = new Person();
        giant.changeColor("red");
        giant.changeSize(250, 75);
        giant.moveHorizontal(210);
        giant.moveVertical(130);
        giant.makeVisible();
        
        staff1 = new Square();
        staff1.changeColor("yellow");
        staff1.moveHorizontal(247);
        staff1.moveVertical(200);
        staff1.changeSize(20);
        staff1.makeVisible();
        
        staff2 = new Square();
        staff2.changeColor("yellow");
        staff2.moveHorizontal(247);
        staff2.moveVertical(180);
        staff2.changeSize(20);
        staff2.makeVisible();
        
        staff3 = new Square();
        staff3.changeColor("yellow");
        staff3.moveHorizontal(247);
        staff3.moveVertical(160);
        staff3.changeSize(20);
        staff3.makeVisible();
        
        staff4 = new Square();
        staff4.changeColor("yellow");
        staff4.moveHorizontal(247);
        staff4.moveVertical(220);
        staff4.changeSize(20);
        staff4.makeVisible();
        
        staff5 = new Square();
        staff5.changeColor("yellow");
        staff5.moveHorizontal(247);
        staff5.moveVertical(140);
        staff5.changeSize(20);
        staff5.makeVisible();
        
        staff6 = new Triangle();
        staff6.changeColor("yellow");
        staff6.moveHorizontal(257);
        staff6.moveVertical(120);
        staff6.changeSize(20, 20);
        staff6.makeVisible();
        
        person1 = new Person();
        person1.changeColor("black");
        person1.changeSize(40, 25);
        person1.moveHorizontal(310);
        person1.moveVertical(275);
        person1.makeVisible();
        
        person2 = new Person();
        person2.changeColor("black");
        person2.changeSize(40, 25);
        person2.moveHorizontal(362);
        person2.moveVertical(273);
        person2.makeVisible();
        
        person3 = new Person();
        person3.changeColor("black");
        person3.changeSize(40, 25);
        person3.moveHorizontal(410);
        person3.moveVertical(272);
        person3.makeVisible();
        
        person4 = new Person();
        person4.changeColor("black");
        person4.changeSize(40, 25);
        person4.moveHorizontal(460);
        person4.moveVertical(275);
        person4.makeVisible();
        
        pyramid = new Triangle();
        pyramid.changeColor("yellow");
        pyramid.changeSize(75, 155);
        pyramid.moveHorizontal(405);
        pyramid.moveVertical(100);
        pyramid.makeVisible();
        
        person5 = new Person();
        person5.changeColor("black");
        person5.changeSize(40, 25);
        person5.moveHorizontal(340);
        person5.moveVertical(230);
        person5.makeVisible();
        
        person6 = new Person();
        person6.changeColor("black");
        person6.changeSize(40, 25);
        person6.moveHorizontal(395);
        person6.moveVertical(230);
        person6.makeVisible();
        
        person7 = new Person();
        person7.changeColor("black");
        person7.changeSize(40, 25);
        person7.moveHorizontal(440);
        person7.moveVertical(230);
        person7.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(68);
        sun.moveHorizontal(445);
        sun.moveVertical(-30);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (person1 != null)   // only if it's painted already...
        {
            background1.changeColor("black");
            background2.changeColor("black");
            chair1.changeColor("white");
            chair2.changeColor("white");
            chair3.changeColor("white");
            chair4.changeColor("white");
            chair5.changeColor("white");
            chair6.changeColor("white");
            chair7.changeColor("white");
            chair8.changeColor("white");
            chair9.changeColor("white");
            chair10.changeColor("white");
            chair11.changeColor("white");
            chair12.changeColor("white");
            giant.changeColor("white");
            staff1.changeColor("white");
            staff2.changeColor("white");
            staff3.changeColor("white");
            staff4.changeColor("white");
            staff5.changeColor("white");
            staff6.changeColor("white");
            person1.changeColor("white");
            person2.changeColor("white");
            person3.changeColor("white");
            person4.changeColor("white");
            pyramid.changeColor("white");
            person5.changeColor("white");
            person6.changeColor("white");
            person7.changeColor("white");
            sun.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (person1 != null)   // only if it's painted already...
        {
            background1.changeColor("blue");
            background2.changeColor("sand");
            chair1.changeColor("black");
            chair2.changeColor("black");
            chair3.changeColor("black");
            chair4.changeColor("black");
            chair5.changeColor("black");
            chair6.changeColor("black");
            chair7.changeColor("black");
            chair8.changeColor("black");
            chair9.changeColor("black");
            chair10.changeColor("black");
            chair11.changeColor("black");
            chair12.changeColor("black");
            giant.changeColor("red");
            staff1.changeColor("yellow");
            staff2.changeColor("yellow");
            staff3.changeColor("yellow");
            staff4.changeColor("yellow");
            staff5.changeColor("yellow");
            staff6.changeColor("yellow");
            person1.changeColor("black");
            person2.changeColor("black");
            person3.changeColor("black");
            person4.changeColor("black");
            pyramid.changeColor("yellow");
            person5.changeColor("black");
            person6.changeColor("black");
            person7.changeColor("black");
            sun.changeColor("yellow");
        }
    }
}
