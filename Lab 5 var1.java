import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JPanel {
    private Color color;
    private Color backColor;
    private int xCoord;
    private int yCoord;

    public Shape() {

    }

    public Color getBackColorl() {
        return backColor;
    }

    public void setBackColorl(Color backColor) {
        this.backColor = backColor;
    } //

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }


    public void paint(Graphics g) {
        g.setColor(getBackColorl());
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}

import java.awt.*;

public class Rect extends Shape {
    private int rectHeight;
    private int width;

    public Rect() {
        super();
        setRectWidth(50);
        setRectHeight(50);
    }

    public int getRectHeight() {
        return rectHeight;
    }

    public void setRectHeight(int rectHeight) {
        this.rectHeight = rectHeight;
    }

    public int getRectWidth() {
        return width;
    }

    public void setRectWidth(int width) {
        this.width = width;
    }


    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(getColor());
        g.drawRect(getxCoord(), getyCoord(), getRectWidth(), getRectHeight());
    }


}

import java.awt.*;

public class Circle extends Shape {
    private int dim;

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }


    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(getColor());
        g.drawOval(getxCoord(), getyCoord(), getDim(), getDim());
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demonstrate extends JFrame {
    Shape[] pnl = new Shape[20];

    public Color generateRandomColor() {
        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }


    public Shape generateRandomShape() {
        int shapeNumber = (int) (Math.random() * 2);
        Shape figure = null;
        System.out.println("shapeNumber = " + shapeNumber);
        switch (shapeNumber) {
            case 0:
                figure = new Rect();
                figure.setxCoord(10);
                figure.setyCoord(10);

                break;
            case 1:
                figure = new Circle();
                figure.setxCoord(30);
                figure.setyCoord(30);
                ((Circle) figure).setDim(30);
                break;


        }
        figure.setColor(generateRandomColor());
        figure.setBackColorl(generateRandomColor());
        return figure;
    }

    public Demonstrate() {
        setLayout(new GridLayout(4, 5));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = generateRandomShape();

            add(pnl[i]);

        }

        setSize(800, 500);
    }

    Rect rectangle = new Rect();

    public static void main(String[] args) {
        new Demonstrate().setVisible(true);
    }
}
