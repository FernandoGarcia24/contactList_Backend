package com.crud.contaclistapi.service;

import com.crud.contaclistapi.dto.ContactDTO;
import com.crud.contaclistapi.entity.Contact;
import com.crud.contaclistapi.exception.ResourseNotFoundException;
import com.crud.contaclistapi.repositoty.ContactRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class ContactService {

    private final ContactRepository contactRepository;
    private final ModelMapper mapper;

    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Contact findById(Integer id) {
        return contactRepository
                .findById(id)
                .orElseThrow(ResourseNotFoundException::new);
    }

    public Contact create(ContactDTO contactDTO) {
        Contact contact = mapper.map(contactDTO, Contact.class);
        contact.setCreatedAt(LocalDateTime.now());
        return contactRepository.save(contact);
    }

    public Contact update(Integer id, ContactDTO contactDTO) {
        Contact contactFromdb = findById(id);
        mapper.map(contactDTO, contactFromdb);
        return contactRepository.save(contactFromdb);
    }

    public void delete(Integer id) {
        Contact contactFromdb = findById(id);
        contactRepository.delete(contactFromdb);
    }
}
