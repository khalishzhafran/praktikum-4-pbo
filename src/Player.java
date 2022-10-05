public class Player extends Character {
  public int gold;

  public Player() {
    this.name = "Default Player Name";
    this.health = 100;
    this.gold = 100;
  }

  public Player(String name, int health, int gold) {
    this.name = name;
    this.health = health;
    this.gold = gold;
  }

  @Override
  public void skin() {
    System.out.println("You use a leather skin");
  }
}
