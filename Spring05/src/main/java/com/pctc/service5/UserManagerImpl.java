package com.pctc.service5;

public class UserManagerImpl implements UserManager {

	public void addUser(String username, String password) {
		System.out.println("-------UserManagerImpl.addUser()----------");
	}

	public void deleteUser(int id) {
		System.out.println("-------UserManagerImpl.deleteUser()----------");
	}

	public String findUserById(int id) {
		System.out.println("-------UserManagerImpl.findUserById()----------");
		return "xxx";
	}

	public void modifyUser(int id, String username, String password) {
		System.out.println("-------UserManagerImpl.modifyUser()----------");
		throw new RuntimeException("出错了");
	}
	
	
	
	
}
