package net.madvirus.spring4.chap06.member;

public class UpdateInfo {
	
	private String newName;

	
	
	
	public String getNewName() {
		return newName;
	}




	public void setNewName(String newName) {
		this.newName = newName;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[newName="+newName+"]";//super.toString();
	}
	
	
	

}
