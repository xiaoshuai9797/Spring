package com.pctc.service1;

public interface UserManager {

	public void addUser(String username, String password);

	public void deleteUser(int id);

	public void modifyUser(int id, String username, String password);

	public String findUserById(int id);
}
