package ru.cybernut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cybernut.domain.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
