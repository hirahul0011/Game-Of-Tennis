import java.io.*;
import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.function.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.Graphics;
import java.applet.Applet;

public interface Paddle{
	public void draw(Graphics g);
	public void move();
	public int getY();
}
