package com.example;

import java.util.List;

import javax.ejb.Local;
import javax.inject.Singleton;

@Local
@Singleton
public interface CrudServiceLocal
{
	public List<Person> getPersonList();
	public void addPerson(Person person);

}
