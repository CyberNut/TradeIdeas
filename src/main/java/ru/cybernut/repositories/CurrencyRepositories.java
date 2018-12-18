package ru.cybernut.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.cybernut.domain.Currency;

import java.util.List;

public interface CurrencyRepositories extends CrudRepository<Currency, Long> {

    List<Currency> findByCode(String code);

}
