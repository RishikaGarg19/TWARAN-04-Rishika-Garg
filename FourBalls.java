import processing.core.PApplet;

public class FourBalls extends PApplet
{   public static void main(String[] args)
{   PApplet.main("FourBalls", args);
}
    public static final int width = 600;
    public static final int height = 400;
    public static final int radius = 10;
    int x1=0, x2=0, x3=0, x4=0;

    @Override
    public void settings()
    {   super.settings();
        size(width, height);
    }

    @Override
    public void setup() //For size
    {
    }

    @Override
    public void draw()
    {   ellipse(x1, (height*1/5), radius, radius);
        x1+=1;
        ellipse(x2, (height*2/5), radius, radius);
        x2=x1*2;
        ellipse(x3, (height*3/5), radius, radius);
        x3=x1*3;
        ellipse(x4, (height*4/5), radius, radius);
        x4=x1*4;
    }
}
