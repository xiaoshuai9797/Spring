package com.pctc.service2;

public class UserManagerImpl implements UserManager {

	//修改源代码
	public void addUser(String username, String password) {
		checkBeforeUser();
		System.out.println("-------UserManagerImpl.addUser()----------");
		checkAfterUser();
	}

	public void deleteUser(int id) {
		checkBeforeUser();
		System.out.println("-------UserManagerImpl.deleteUser()----------");
		checkAfterUser();
	}

	public String findUserById(int id) {
		checkBeforeUser();
		System.out.println("-------UserManagerImpl.findUserById()----------");
		checkAfterUser();
		return null;
	}

	public void modifyUser(int id, String username, String password) {
		checkBeforeUser();
		System.out.println("-------UserManagerImpl.modifyUser()----------");
		checkAfterUser();
	}



	private void checkBeforeUser()
	{
		System.out.println("before 11111******&&&&&222222----");
	}


	private void checkAfterUser()
	{
		System.out.println("after 11111******&&&&11111----");
	}

}
