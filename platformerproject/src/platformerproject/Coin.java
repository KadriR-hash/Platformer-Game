package platformerproject;


import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.image.Image;





public class Coin extends entity {
	
	final static Image coin =  new Image("/platformerproject/coin.png");
	public ImageView mycoin = new ImageView(coin);
	private static Integer coinvalue = 100;
	public Coin()
	{
		transform=mycoin;	
		
	}
	public static Integer getCoinvalue() {
		return coinvalue;
	}

	


}
