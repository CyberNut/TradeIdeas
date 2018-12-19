package ru.cybernut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cybernut.domain.Currency;

import java.util.List;

public interface CurrencyRepositories extends JpaRepository<Currency, Long> {

    List<Currency> findByCode(String code);

}
