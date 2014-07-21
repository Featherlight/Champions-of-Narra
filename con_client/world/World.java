package con_client;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import conclient.Client;

public class World {

	private Client c;
	
	public World (Client c){
		this.c = c;
	}
	
	public void initialize(){
		
		//	String[] regionData = fetchRegionData (c.getPlayer().getRegionID());
	}
	
	/**
	 * Returns the data found with this format:
	 * objID|npcID:tileID, objID|npcID:tileID
	 */
	public String[] fetchRegionData (int regionId){
		
		List<String> regionData = new ArrayList<String>();
		Path p = Paths.get(c.getConfig().getDirectory() + "regions\\", "region" + regionId + ".txt");

		try {
			regionData = Files.readAllLines(p, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return regionData.toArray(new String[regionData.size()]);
	}
	
}
