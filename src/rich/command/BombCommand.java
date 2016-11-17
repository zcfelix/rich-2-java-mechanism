package rich.command;

import com.sun.tools.javac.util.Pair;
import rich.GameMap;
import rich.Message;
import rich.Player;
import rich.Tool;

public class BombCommand implements Command {
    private GameMap map;
    private int bombPosition;

    public BombCommand(GameMap map, int bombPosition) {
        this.map = map;
        this.bombPosition = bombPosition;
    }

    @Override
    public Pair<Player.Status, Message> execute(Player player) {
        if (player.getQuantityByKind(Tool.Bomb) <= 0) {
            return new Pair<>(Player.Status.WAIT_FOR_COMMAND, Message.NO_BOMBS_NOW);
        }

//        int targetPosition = bombPosition + player.getCurrentPlace();
        int targetPosition = 0;
        Message message = map.putTool(Tool.Bomb, targetPosition);
        return new Pair<>(Player.Status.WAIT_FOR_COMMAND, message);
    }

    @Override
    public Pair<Player.Status, Message> respondWith(Player player, Response response) {
        return null;
    }
}
