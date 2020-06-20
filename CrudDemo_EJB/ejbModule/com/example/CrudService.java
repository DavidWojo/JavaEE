package com.example;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@LocalBean
public class CrudService implements CrudServiceLocal
{
	@PersistenceContext
	private EntityManager entityManager;

    public CrudService()
    {
    }

	@Override
	public List<Person> getPersonList()
	{
		return this.entityManager.createQuery("select p from Person p", Person.class).getResultList();
	}
	
	@Override
	public void addPerson(Person person)
	{
		this.entityManager.persist(person);
	}
}
