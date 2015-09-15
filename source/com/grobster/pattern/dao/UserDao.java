package com.grobster.pattern.dao;

import java.util.*;

public interface UserDao {
	public int create(User u);
	public User get(String lastName);
	public boolean delete(User u);
	public boolean update(User u);
	public Collection<User> getAll();
}