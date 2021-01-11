package com.relationship.demo.Reopsitories;

import com.relationship.demo.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository  extends CrudRepository<Person,Long> {
    List<Person> findAll();


}
