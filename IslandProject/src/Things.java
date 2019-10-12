
public class Things {
	private String name;
	private String type;
	private int energy;
	private int x;
	private int y;
	private String symbol;
	
	public Things(String name, String type, int energy, int x, int y,String symbol) {
		this.setEnergy(energy);
		this.setName(name);
		this.setSymbol(symbol);
		this.setType(type);
		this.setX(x);
		this.setY(y);
	}
	
//	public String toString() {
//		return name+" "+x+" "+y;
//	}
	
	
	public void displayInfo() {
		System.out.println("Name: "+this.name+"\n"
						 +"Types: "+ this.type+"\n"
						 +"Symbol: "+ this.symbol+"\n");
	}
	
	public void position(int width, int height) {
		int ranX = (int) Math.floor(Math.random()*(width-1));
		int ranY = (int) Math.floor(Math.random()*(height-1));
		this.setX(ranX);
		this.setY(ranY);
	}
	
	//Getter and Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
