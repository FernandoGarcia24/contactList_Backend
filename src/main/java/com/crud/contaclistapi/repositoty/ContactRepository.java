package com.crud.contaclistapi.repositoty;

import com.crud.contaclistapi.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
