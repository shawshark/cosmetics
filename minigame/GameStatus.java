package net.shawshark.core.plugin.minigame;

public enum GameStatus {
	WAITING_FOR_PLAYERS, IN_GAME, GAME_FINISHED;


	public static GameStatus getGameStatus(String status) {
		try {
			return valueOf(status);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}