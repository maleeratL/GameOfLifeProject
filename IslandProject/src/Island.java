import java.util.ArrayList;
import java.util.List;

public class Island {
	
	private int width =30;
	private int height=25;

	
	public Island(int width, int height) {
		this.width =width;
		this.height = height;
		
	}
	
	private List<Things> things = new ArrayList<>();
	
	private void printAnimals(int x, int y) {
		
		for (Things t : things) {
			if (t.getX() == x && t.getY() == y&&!(t instanceof WaterAnimals)) {
				System.out.print(t.getSymbol());
				return;
			}
		}
		System.out.print(' ');
	}
	
	private void printWaterAnimals(int x, int y) {
		
		for (Things t : things) {
			if (t.getX() == x && t.getY() == y&&t instanceof WaterAnimals) {
				System.out.print(t.getSymbol());
				return;
			}
		}
		System.out.print('~');
	}
	
	
	public void drawEnd() {
		System.out.print('|');
		for(int k=0; k<getWidth(); k++) {
			System.out.print("-");
		}
		System.out.println('|');
	}
	
	public void drawWater() {
		for(int j=0; j<getHeight()/3; j++) {
			System.out.print('|');
			for(int i=0; i<getWidth(); i++) {
				printWaterAnimals(i,j);
			}
			System.out.println('|');
		}	
	}
	
	public void drawIsland() {
		
		this.drawEnd();
		this.drawWater();
		for(int j=0; j<getHeight(); j++) {
			System.out.print('|');
			for(int i=0; i<getWidth(); i++) {
				printAnimals(i,j);
			}
			System.out.println('|');
		}	
		
		this.drawEnd();
	}
	
	public void generateIsland() {
//		drawIsland();
		for(Things t:things) {
			if(t instanceof Plants) {
				t.position(width, height);				
			}
		}
		for(int i=0; i<10; i++) {
			for(Things t: things) {
				if(t instanceof Animals&&t instanceof WaterAnimals) {
					this.randomPosition();
				}
				if(t instanceof Plants) {
					int count = Integer.valueOf(t.getSymbol());
					if(count<9) {
						count++;
						t.setSymbol(String.valueOf(count));
					}
					
				}
			}
			drawIsland();
		}
		

	}
	
	
	public void randomPosition() {
		for(Things t: things) {
			if(t instanceof Animals||t instanceof WaterAnimals) {
				int tempX = t.getX();
				int tempY = t.getY();
				((Animals) t).randomMove();
				if(outOfIsland(t)) {
					t.setX(tempX);
					t.setY(tempY);
				}
			}
		}
	}
	
	public boolean outOfIsland(Things t) {
		if(t.getX()<0) {
			return true;
		}
		else if(t.getX()>getWidth()-1) {
			return true;
		}
		else if(t.getY()<0) {
			return true;
		}
		else if(t.getY()>getHeight()-1) {
			return true;
		}
		return false;
	}
	
	
	
	public void add(Things t) {
		things.add(t);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void reportSurviveAnimals () {
		for(Things t: things) {
			System.out.println("Name: "+t.getName()+"\nSymbol: "+t.getSymbol());
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
}
