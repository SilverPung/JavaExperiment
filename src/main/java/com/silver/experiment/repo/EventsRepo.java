package com.silver.experiment.repo;

import com.silver.experiment.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventsRepo extends JpaRepository<Event, Long> {
}
