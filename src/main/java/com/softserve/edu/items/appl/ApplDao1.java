package com.softserve.edu.items.appl;


import com.softserve.edu.items.dao.OrderDao;
import com.softserve.edu.items.dao.RoleDao;
import com.softserve.edu.items.dao.UserDao;

public class ApplDao1 {

	public static void main(String[] args) {
		System.out.println("Start ...");
		//
		RoleDao roleDao = new RoleDao();
		UserDao userDao = new UserDao();
		OrderDao orderDao = new OrderDao();
		//
		// Insert
		// Role
		//roleDao.insert(new Role(3L, "Administrator"));
		//roleDao.insert(new Role(4L, "User"));
		//
		// User
		//userDao.insert(new User(1L, "ivan", "qwerty", "adminIvan", 1L));
		//userDao.insert(new User(2L, "petro", "qwerty", "userPentro", 2L));
		//
		// Item
		//orderDao.insert(new Order(4L, "Achan","str.Five", "Artek1",4,"done", 2L));		
		//
		// Select
		//System.out.println(roleDao.getAll());
		//System.out.println(roleDao.getById(1L));
		//System.out.println(roleDao.getByFieldName("name", "User"));
		//
		//System.out.println(userDao.getAll());
		//System.out.println(userDao.getById(1L));
		//System.out.println(userDao.getByFieldName("name", "petro"));
		//System.out.println(userDao.getByFieldName("name", "petro").get(0).getName());
		//
		//System.out.println(orderDao.getAll());
		//System.out.println(orderDao.getById(1L));
		//System.out.println(orderDao.getByFieldName("idUser", "1"));
		//
		// Update
		//roleDao.updateByEntity(new Role(30L, "Administrator12112"));
		//roleDao.updateByFieldName("name", "User", "name", "User1");// �����2 ���� �� �� ������,� 3,4 ���� �� ���
		//
		
		//userDao.updateByEntity(new User(3L, "3@333", "333", "userOleg33", 2L));//��� ����� �� �������� � �� ���
		//userDao.updateByFieldName("name", "userOleg123", "password", "qwerty11");//1�����-������� ��� ��� 2-���� ��� ����� � (1)������� 3-����� ������� 4-���� ����� ���� ��� ������ � �� ���� �������� � ������� ������ 3
		// �� ����� query = UPDATE users SET name = 'adminIvanSuper' WHERE login = 'ivan11'
		//
		//orderDao.updateByEntity(new Order(3L, "Arsen1", "str.Three", "Artek1", 33,"done", 2L));
		//orderDao.updateByFieldName("scope", "5", "shop", "Achan");
		//
		// Delete
		//roleDao.delete(new Role(4L, "User"));
		//roleDao.deleteByFieldName("name", "Administrator1");
		//roleDao.deleteById(9L);
		//
		//userDao.delete(new User(4L, "petro", "qwerty1", "userPentro1", 2L));
		//userDao.deleteByFieldName("name", "adminIvanSuper");
		//userDao.deleteById(5L);
		//
		//orderDao.delete(new Order(5L, "Achan","str.Five ", "Artek1",5,"done", 2L));
		//orderDao.deleteByFieldName("shop", "Arsen1");
		//orderDao.deleteById(4L);
		//
		System.out.println("Done");
	}

}
