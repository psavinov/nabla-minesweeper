package ru.nabla.minesweeper.game;

import ru.nabla.minesweeper.game.field.Field;
import ru.nabla.minesweeper.game.field.FieldPointState;

public class game {
	
	private int id;
	private boolean isStrart;
	private Field field;
	private int idActiveUser;
	private Users[] users;
	private int userCount;
	private int timeForMove;
	
	
	public game(Field field){
		setField(field);
		this.users = new Users[];
		this.userCount=0;
		this.timeForMove=30;
	}
	
	public void setTimeForMove(int seconds){
		this.timeForMove=seconds;
	}
	
	public int getTimeForMove(){
		return timeForMove;
	}
	
	public Field setFielld(Filed field){
		this.field=field;
	}
	
	public void addUser(Users user){
		if (userCount=2) {
			throw new IllegalArgumentException("A lot of users in game!");
		this.users[userCount]=new Users();
		this.users[this.userCount]=user;
		this.userCount++;
	}
	
	public void changeActiveUser(){
		this.idActiveUser=1-idActiveUser;
	}
	
	public void setIdActiveUser(int userid){
		this.idActiveUser=userid;
	}
	
	public int getIdActiveUser(){
		return idActiveUser;
	}
	
	public Users getActiveUser(){
		return users[idActiveUser];
	}
	
	public void gameStart(){
		this.isStrart=true;
		this.users[0].setGameScore(0);
		this.users[1].setGameScore(0);
	}
	
	public void gameStop(){
		this.isStrart=false;
	}
	
	public void countScore(){
		;;
	}
	
	public boolean isGameEnd(){
		if (this.field.getMineLost()==0){
			int closeCount = 0;
			for (int i=0;i<this.field.getWidth(); i++){
				for (int j=0;j<this.field.getHeight();j++){
					if (this.field.getPoints()[i][j].getMask()==FieldPointState.CLOSE){
						closeCount++;
					}
				}
			}
			if (closeCount>0) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	

}
