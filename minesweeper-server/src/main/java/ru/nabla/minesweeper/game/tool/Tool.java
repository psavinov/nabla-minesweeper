package ru.nabla.minesweeper.game.tool;

import ru.nabla.minesweeper.game.field.FieldPoint;

public interface Tool {
	
	public int getCost();
	
	public FieldPoint process(FieldPoint point);

}
