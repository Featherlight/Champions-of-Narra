package con_client;

public class Config {

	private int display;
	private int resolution;
	private int textureQuality, fxQuality, shadowQuality;
	private boolean antiAliasing;
	private String directory;
	
	public static int FULLSCREEN=0, WINDOWED=1;
	public static String[] RESOLUTION = {"800x600", "1024x600", "1280x720", "1280x1024", "1366x768", "1600x900", "1920x1080"};
	
	public int getDisplay (){
		return display;
	}
	
	public int getResolution (){
		return resolution;
	}
	
	public int getTextureQuality (){
		return textureQuality;
	}
	
	public int getFXQuality (){
		return fxQuality;
	}
	
	public int getShadowQuality (){
		return shadowQuality;
	}
	
	public boolean antiAliasing (){
		return antiAliasing;
	}
	
	public String getDirectory (){
		return directory;
	}
	
	public void setDisplay (int displayType){
		this.display = displayType;
	}
	
	public void setResolution (int resolution){
		this.resolution = resolution;
	}
	
	public void setTextureQuality (int quality){
		this.textureQuality = quality;
	}
	
	public void setFXQuality (int quality){
		this.fxQuality = quality;
	}
	
	public void setShadowQuality (int quality){
		this.shadowQuality = quality;
	}
	
	public void setAntiAliasing (boolean value){
		this.antiAliasing = value;
	}
	
}
