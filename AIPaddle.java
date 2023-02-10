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

public class AIPaddle implements Paddle{
    double y, yVel;
    boolean upAccel, downAccel;
    final double Gravity=0.94; 
    int player,x;
    Ball b1;
    
    public AIPaddle(int player,Ball b){
        upAccel=false; downAccel=false;
        b1=b;
        y=210;yVel=0;
        if(player==1)
            x=20;
        else
            x=660;
    }
    
	public void draw(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(x,(int)y,20,80);
	}
	public void move(){
	    y=b1.getY()-40;   
	    
	    if(y<0)
    	    y=0;
    	if(y>420)
    	    y=420;
	}
	
	public int getY(){
	    
	    return (int)y;
	}
}
