package com.pctc.service3;


//设计模式23经典，代理模式是23种之中一个
//面向添加时打开，面向修改时关闭的，这是有名设计原则：开闭原则

//静态代理模式(1.实现接口，2.调用接口)
//不修改原代码的，从而使类的功能改变

//（Proxy）针对每个接口类编写代理类，工作量巨大，只是学习它的思想
public class UserManagerImplProxy implements UserManager
{

	private UserManagerImpl userManagerimpl = new UserManagerImpl();

	/*private UserManager userManager;
	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;
	}*/


	public void addUser(String username, String password) {
		checkBefore();

		//原有实现类的方法
		this.userManagerimpl.addUser(username, password);

		checkAfter();
	}



	public void deleteUser(int id) {
		checkBefore();
		//原有实现类的方法
		this.userManagerimpl.deleteUser(id);
		checkAfter();
	}

	public String findUserById(int id) {
		checkBefore();
		//原有实现类的方法
		return this.userManagerimpl.findUserById(id);

	}

	public void modifyUser(int id, String username, String password) {
		checkBefore();
		//原有实现类的方法
		this.userManagerimpl.modifyUser(id, username, password);
		checkAfter();
	}




	public void checkBefore()
	{

		System.out.println("before ------");

	}

	public void checkAfter()
	{

		System.out.println("after ------");

	}









}
