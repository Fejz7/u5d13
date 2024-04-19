package project.u5d13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d13.entities.Event;


public interface EventDAO extends JpaRepository<Event, Long> {

}
