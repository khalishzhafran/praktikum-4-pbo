public class App {
    public static void main(String[] args) throws Exception {
        Player prince = new Player("Prince", 100, 0);
        Monster ogre = new Monster();

        prince.skin();
        ogre.skin();
    }
}
