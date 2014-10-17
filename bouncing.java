package Warmup;

import zen.core.Zen;

public class Bouncing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zen.create(800,800);
		//variables
		int x = 50;
		int y = 50;
		int xspeed = 4;
		int yspeed = 0;
		int paddley = 250;
		int paddley2 = 250;
		
		while(true){
			Zen.setBackground("White");
			Zen.setColor("light green");
			//Ball
			Zen.fillOval(x, y, 30, 30);
			x = x+ xspeed;
			y = y+ yspeed;
			yspeed = yspeed + 1;
			//Paddle
			Zen.setColor("light pink");
			Zen.fillRect(750, paddley, 10, 50);
			if(Zen.isKeyPressed("up")){
				paddley = paddley - 5;
			}
			if(Zen.isKeyPressed("down")){
				paddley = paddley + 5;
			}
			
			//Paddle2
			Zen.setColor("light yellow");
			Zen.fillRect(50, paddley2, 10, 50);
			
			if(Zen.isKeyPressed("s")){
				paddley2 = paddley2 + 5;
			}
			
			if(Zen.isKeyPressed("w")){
				paddley2 = paddley2 - 5;
			}
			if(y > 700){
				y = 700;
				yspeed = -yspeed;
				yspeed = yspeed * 9/10;
			}
			
			if(x > 750){
				xspeed = -xspeed;
			}
			
			if(x < 50){
				xspeed = -xspeed;
			}
			if(x>720 && x < 750 && y > paddley && y < paddley + 50){
				x = 720;
				xspeed = -xspeed;
			}
			Zen.buffer(30);
			
		}
		}
		

}
