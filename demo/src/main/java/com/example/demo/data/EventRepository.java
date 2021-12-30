package com.example.demo.data;

import com.example.demo.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//import javax.transaction.Transactional; TODO: Research, which Transactional Import do you need?

@Repository
@Transactional
public interface EventRepository extends CrudRepository<Event, Integer> {
}
