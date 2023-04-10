package gamelevel;

public class MainBoard {

    public static void main(String[] args) {
        Player player = new Player();   //처음 생성하면 beginnerlevel
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
