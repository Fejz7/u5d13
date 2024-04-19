package project.u5d13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d13.entities.Event;


public interface EventRepository extends JpaRepository<Event, Long> {

}
