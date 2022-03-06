import processing.core.PApplet;

public class FourBalls extends PApplet
{   public static final int width = 600;
    public static final int height = 400;
    public static final int radius = 10;
    public static int speed = 1;
    int x1=0, x2=0, x3=0, x4=0;

    @Override
    public void settings()
    {   super.settings();
        size(width, height);
    }

    @Override
    public void setup()
    {   Ball.setRadius(radius);
        Ball.setSpeed(speed);
    }

    public void newBall(int x, int y)
    {   ellipse(x, y, FourBalls.radius, FourBalls.radius);
    }

    @Override
    public void draw()
    {   newBall(x1, (height/5));
        x1+=speed;
        newBall(x2, (height*2/5));
        x2=x1*2;
        newBall(x3, (height*3/5));
        x3=x1*3;
        newBall(x4, (height*4/5));
        x4=x1*4;
    }

    public static void main(String[] args)
    {   PApplet.main("FourBalls", args);
    }
}
