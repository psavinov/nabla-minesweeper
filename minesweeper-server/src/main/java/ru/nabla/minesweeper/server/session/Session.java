package ru.nabla.minesweeper.server.session;

import java.util.Map;

public interface Session {
	
	public String getId();
	
	public Map<String, Object> getAttributes();
	
	public Object getAttribute(String name);
	
	public boolean isValid();
	
	public void invalidate();

}
