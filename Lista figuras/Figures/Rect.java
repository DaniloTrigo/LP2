package figures;

import java.awt.*;

public class Rect extends Figure {
    int w, h;
    int rf, gf, bf;

    public Rect (int x, int y, int w, int h, int r, int g, int b, int rf, int gf, int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.r, this.g, this.b));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        g2d.setColor(new Color(this.rf, this.gf, this.bf));
        g2d.fillRect(this.x+1, this.y+1, this.w-1, this.h-1);
    }
}