public interface Fightable {
    boolean canFight();
}

abstract class Superhero implements Fightable {
    public abstract void fightCrime();
    public boolean canFight() {
    	System.out.println("returns true in superhero's canfight method");
    	return true;
    }
}

class TeenTitan extends Superhero {
    public void describeCostume() {
    	System.out.println("teentitan's describe costume method");
    }
    public void fightCrime() {
    	System.out.println("in teentitan's fightcrime method");
    }
}

class Raven extends TeenTitan {
    public void describeCostume() {
	    	System.out.println("ravens describe costume method");
    }
}

class Superman extends Superhero {
    public String getSecretIdentity() {
    	System.out.println("supermans getsecretidentity method");
    	return "Clark";
    }
    public String describeCostume() {
        	System.out.println("supermans describe costume method");
        	return "cape";
    }
    public void fightCrime() {
    	System.out.println("in superman's fightcrime method");
    }
}
class Tester {
	public static void main(String[] args) {
		TeenTitan t1 = new Raven();
		t1.describeCostume();

		//Superhero s1 = new Raven();
		//s1.describeCostume();

		//Superhero s2 = new Superhero();
		//s2.fightCrime();

		//Superhero s3 = new Raven();
		//((Raven) s3).fightCrime();

		//Raven r1 = new Raven();
		//r1.fightCrime();


	  //Superman sm1 = new Superhero();
		//sm1.fightCrime();

		//Superhero sm2 = new Superman();
		//sm2.fightCrime();

		//Raven r2 = new Superman();
		//r2.getSecretIdentity();

		//Raven r3 = new Raven();
		//r3.getSecretIdentity();

		//Superhero s4 = new TeenTitan();
		//s4.fightCrime();

		//Superhero s5 = new Fightable();
		//System.out.println(s5.canFight());

		//Superhero s6 = new Superman();
		//System.out.println(s6.canFight());


}
}
