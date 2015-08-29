package ru.nabla.minesweeper.game.tool;

public interface Tool {
	
	public int getCost();
	
	public FieldPoint process(FieldPoint point);

}
