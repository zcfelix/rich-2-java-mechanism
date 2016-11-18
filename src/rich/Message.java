package rich;

public enum Message {

    COME_TO_EMPTY_LAND, COME_TO_SELF_LAND,

    COME_TO_OTHERS_LAND_PAY_SUCCESSFUL, COME_TO_OTHERS_LAND_PAY_FAILED, COME_TO_OTHERS_LAND_WITH_MASCOT,
    COME_TO_OTHERS_LAND_WITH_OWNER_IN_PRISON, COME_TO_OTHERS_LAND_WITH_OWNER_BOMBED_INTO_PRISON,

    AUTO_EXIT_TOOL_ROOM, COME_TO_TOOL_ROOM,

    COME_TO_GIFT_ROOM, COME_TO_PRISON, COME_TO_MINERAL_ESTATE,

    PUT_BLOCK_SUCCESS, NO_BLOCKS_NOW, CANT_PUT_BLOCK_WHEN_PLAYER_ON, CANT_PUT_BLOCK_WHEN_EXIST_TOOL,

    PUT_BOMB_SUCCESS, NO_BOMBS_NOW, CANT_PUT_BOMB_WHEN_PLAYER_ON, CANT_PUT_BOMB_WHEN_EXIST_TOOL,

    NO_ROBOTS_NOW, ROBOT_CLEAN_SUCCESS, NO_THAT_TOOL_FOR_SELL, SELL_TOOL_SUCCESS,

    CANT_SELL_OTHERS_LAND, SELL_LAND_SUCCESS, CANT_SELL_PUBLIC_LAND,

    SHOW_QUERY_INFO,

    SHOW_HELP_INFO,

    NO_ENOUGH_MONEY_TO_BUY_LAND,

    NO_ENOUGH_MONEY_TO_UPGRADE_LAND, LAND_ALREADY_TOP_LEVEL,

    BUY_BOMB_SUCCESS, NO_ENOUGH_POINTS_BUY_BOMB, BUY_ROBOT_SUCCESS, NO_ENOUGH_POINTS_BUY_ROBOT, No_POINTS_BUY_ANYMORE_TOOL_EXIT, TOOL_QUANTITY_LIMITED_EXIT, BUY_BLOCK_SUCCESS, NO_ENOUGH_POINTS_BUY_BLOCK, CHOOES_EXIT_TOOL_ROOM, NULL
}
