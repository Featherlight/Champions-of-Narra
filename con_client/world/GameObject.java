package con_client;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;

public class GameObject {

	private World world;
	private int id;
	private BufferedImage bImg;
	private VolatileImage vImg;
	private int x, y;
	private String tag;
	
	//	VolatileImages are hardware-accelerated images and should be used if the GameObject does move
	public GameObject (World world, VolatileImage vImg, int x, int y){
		this.vImg = vImg;
		this.x = x;
		this.y = y;
	}
	
	//	BufferedImages should be used if the GameObject doesn't move (Ex. A house)
	public GameObject (World world, BufferedImage bImg, int x, int y){
		this.world = world;
		this.bImg = bImg;
		this.x = x;
		this.y = y;
	}
	
	public int getId (){
		return id;
	}
	
	public String getTag (){
		return tag;
	}
	
	public void setTags (String tag){
		this.tag = tag;
	}
	
}
