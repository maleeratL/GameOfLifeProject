
public class Animals extends Things {
	
	public Animals(String name, String type, int energy, int x, int y,String symbol) {
		super(name,type,energy,x,y,symbol);
	}
	
	public void checkDistance(Things t,int radius) {
		String direction ="";
		if(t.getX()<this.getX()+radius) {
			direction ="R";
		}
		else if(t.getX()<this.getX()-radius) {
			direction ="L";
		}
		else if(t.getY()<this.getY()+radius) {
			direction ="D";
		}
		else if(t.getY()<this.getY()-radius) {
			direction ="T";
		}
		this.move(direction);
	}

	
	public void randomMove() {
		double ran = Math.random();
		String direction="";
		if(ran<0.25) {
			direction ="L";
		}
		else if (ran<0.5) {
			direction ="R";
		}
		else if(ran<0.75) {
			direction ="T";
		}
		else {
			direction = "D";
		}
		this.move(direction);
	}
	
	public void move(String direction) {
		if("L".equals(direction)) {
			this.setX(this.getX()-1);
		}
		else if("R".equals(direction)) {
			this.setX(this.getX()+1);
		}
		else if("T".equals(direction)) {
			this.setY(this.getY()-1);
		}
		else if("D".equals(direction)) {
			this.setY(this.getY()-1);
		}
	}
	
	
}
