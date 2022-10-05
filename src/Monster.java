public class Monster extends Character {
  public int damage;

  public Monster() {
    this.name = "Default Monster Name";
    this.health = 100;
    this.damage = 10;
  }

  public Monster(String name, int health, int damage) {
    this.name = name;
    this.health = health;
    this.damage = damage;
  }

  @Override
  public void skin() {
    System.out.println("You use a stone skin");
  }
}
