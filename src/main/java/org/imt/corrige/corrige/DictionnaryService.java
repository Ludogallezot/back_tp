package org.imt.corrige.corrige;

import java.util.Collection;

import org.imt.corrige.corrige.itf.DictionnaryItf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionnaryService implements DictionnaryItf {

//	Map<Integer, Person> hm;
	@Autowired
	PersonRepository pr;

	public DictionnaryService() {
//		super();
//		hm = new HashMap<Integer, Person>();
//		hm.put(1, new Person(1, "Who", "Doctor", "0606060606", "Lille"));
//		hm.put(2, new Person(2, "Bond", "James", "0606060606", "Londres"));
//		hm.put(3, new Person(3, "Macron", "Emmanuel", "0606060606", "Paris"));
//		hm.put(4, new Person(4, "Gallezot", "Ludovic", "0689142698", "Quincieux"));
	}

	@Override
	public Collection<Person> getAll() {
//		return (Collection<Person>) (hm.values());
		return pr.findAll();
	}

	@Override
	public Person getFromId(int id) {
//		
		return pr.findById(id);
	}

	@Override
	public void deleteFromId(int id) {
//		if (hm.remove(id) != null)
//			return true;
//		return false;
		pr.deleteById(id);
	}

	@Override
	public void addPerson(Person p) {
//		hm.put(p.getId(), p);
		pr.save(p);
	}

	@Override
	public Collection<Person> findByName(String name) {
//		return hm.values().stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());
		return pr.findByName(name);
	}

}
