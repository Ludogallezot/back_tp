package org.imt.corrige.corrige;

import java.util.Collection;

public interface DictionnaryItf {
	public Collection<Person> getAll();

	public Person getFromId(int id);

//	public Collection<Person> getFromName(String name);

	public Collection<Person> findByName(String name);

	public void deleteFromId(int id);

	public void addPerson(Person p);
}