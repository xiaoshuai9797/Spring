package com.pctc.service4;

public class UserManagerImpl implements UserManager {

	public void addUser(String username, String password) {
		System.out.println("-------UserManagerImpl.addUser()----------");
	}

	public void deleteUser(int id) {
		System.out.println("-------UserManagerImpl.deleteUser()----------");
	}

	public String findUserById(int id) {
		System.out.println("-------UserManagerImpl.findUserById()----------");
		return "abc";
	}

	public void modifyUser(int id, String username, String password) {
		System.out.println("-------UserManagerImpl.modifyUser()----------");
	}




}
