
public class DisplayIsland {
	
	public void runIsland(int width, int height) {
		Island is = new Island(width,height);
		Animals a1 = new Animals("Cats", "P",2,10,10,"C");
		is.add(a1);
		Animals a2 = new Rabbit(12,12);
		is.add(a2);
		Animals a3 = new Bird(5,10);
		is.add(a3);
		Animals a4 = new WaterAnimals("Fish", "H",2,5,4,"F");
		is.add(a4);
		Animals a5 = new Kiwi(10,5);
		is.add(a5);
		Animals a6 = new AirAnimals("Sparrow", "P",50,15,15,"S");
		is.add(a6);
		Animals a7 = new Crocodiles(2,2);
		is.add(a7);
		Animals a8 = new Rat(7,7);
		is.add(a8);
		
		Plants t = new Plants("Pine tree","P",20,15,24,"0");
		is.add(t);
		Plants t1 = new AppleTree(10,18);
		is.add(t1);
		Plants t2 = new Grass(20,0);
		is.add(t2);
		is.generateIsland();
		is.reportSurviveAnimals();
	}

	public static void main(String[] args) {
		
		DisplayIsland is1 = new DisplayIsland();
		is1.runIsland(30,25);
		
		DisplayIsland is2 = new DisplayIsland();
		is2.runIsland(40,15);
		
	}

}
