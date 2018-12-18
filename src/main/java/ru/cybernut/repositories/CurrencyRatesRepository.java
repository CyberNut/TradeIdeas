package ru.cybernut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cybernut.domain.CurrencyRate;

public interface CurrencyRatesRepository extends JpaRepository<CurrencyRate, Long> {

}
