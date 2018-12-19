package ru.cybernut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cybernut.domain.TradeIdea;

public interface TradeIdeasRepository extends JpaRepository<TradeIdea, Long> {

}
