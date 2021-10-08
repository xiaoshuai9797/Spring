package com.pctc.service1;

public class UserManagerImpl implements UserManager {

	//模拟
	public void addUser(String username, String password) {
		System.out.println("before1---1111b");

		System.out.println("-------UserManagerImpl.addUser()----------");

		System.out.println("after1---1111b");
	}

	public void deleteUser(int id) {
		System.out.println("before1---1111b");

		System.out.println("-------UserManagerImpl.deleteUser()----------");

		System.out.println("after1---1111b");
	}

	public String findUserById(int id) {
		System.out.println("before1---1111b");

		System.out.println("-------UserManagerImpl.findUserById()----------");

		System.out.println("after1---1111b");
		return null;
	}

	public void modifyUser(int id, String username, String password) {
		System.out.println("before1---1111b");

		System.out.println("-------UserManagerImpl.modifyUser()----------");

		System.out.println("after1---111b");
	}




}
