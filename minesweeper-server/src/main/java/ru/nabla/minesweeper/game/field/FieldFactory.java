package ru.nabla.minesweeper.game.field;

public class FieldFactory {
	
	public static Field getRandomField(int width, int height, int minesCount) {
		Field field = new Field(width, height);
		
		return field;
	}

}
