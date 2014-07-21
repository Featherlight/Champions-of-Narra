package con_client;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import conclient.world.World;

public class Client extends JFrame{

	private Client c = this;
	private Config config;
	private World world;
	private int scale;
	private boolean running;
	private Canvas canvas;
	
	public Config getConfig (){
		return config;
	}
	
	public void initialize (){
		
	}
	
	private class ClientWorker implements Runnable{

		@Override
		public void run (){
 
			canvas.createBufferStrategy(2);
			BufferStrategy bs = canvas.getBufferStrategy();
			
			while (running){
				update();
				render(bs);
				sync();
			}
			
		}
		
		private void update (){
			
			/**
			 * @TODO
			 * camera.update();
			 * world.update();
			 * 
			 */
			
		}
		
		private void sync (){
			
		}
		
		public void render (BufferStrategy bs){
			
			Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();
			
			//	Configuration
			g2.setColor(Color.BLACK);
			g2.fillRect(0, 0, c.getWidth(), c.getHeight());
			
			//	Render all objects that require it
			renderGameObjects(g2);
			
			renderShadows(g2);
			
		}
		
		public void renderGameObjects (Graphics2D g2){
			
		}
		
		private void renderShadows (Graphics2D g2){
			
		}
		
	}
	
	public class Camera {
		
		int x, y;
		
	}
	
}
