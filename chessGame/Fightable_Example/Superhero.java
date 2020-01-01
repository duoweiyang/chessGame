public abstract class Superhero implements Fightable {
    public boolean canFight() {
        System.out.println("Superhero's canFight");
        return true;
    }

    public abstract void fightCrime();
}
