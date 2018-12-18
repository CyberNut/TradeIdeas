package ru.cybernut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.cybernut.domain.Currency;
import ru.cybernut.domain.CurrencyRate;
import ru.cybernut.repositories.CurrencyRatesRepository;
import ru.cybernut.repositories.CurrencyRepositories;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private CurrencyRepositories currencyRepositories;
    @Autowired
    private CurrencyRatesRepository currencyRatesRepository;
    @GetMapping("/test")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "test";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Currency> currencies = currencyRepositories.findAll();
        Iterable<CurrencyRate> currencyRates = currencyRatesRepository.findAll();
        model.put("currencies", currencies);
        model.put("currencyRates", currencyRates);
        return "test";
    }

    @PostMapping
    public String add(@RequestParam Long id, @RequestParam String code, @RequestParam String name, Map<String, Object> model) {
        Currency currency = new Currency(id, name, code);
        currencyRepositories.save(currency);

        Iterable<Currency> currencies = currencyRepositories.findAll();
        model.put("currencies", currencies);

        return "test";
    }

    @PostMapping("addRate")
    public String addRate(@RequestParam Long date, @RequestParam String code, @RequestParam double rate, @RequestParam double multiplicity, Map<String, Object> model) {

        Currency currency = null;

        if(!code.isEmpty()) {
            List<Currency> currencyList = currencyRepositories.findByCode(code);
            if(currencyList.size() > 0) {
                currency = currencyList.get(0);
            }
        }

        if(currency != null) {

            CurrencyRate currencyRate = new CurrencyRate(currency, date, rate, multiplicity);
            currencyRatesRepository.save(currencyRate);
        }

        Iterable<Currency> currencies = currencyRepositories.findAll();
        Iterable<CurrencyRate> currencyRates = currencyRatesRepository.findAll();
        model.put("currencies", currencies);
        model.put("currencyRates", currencyRates);

        return "test";
    }

}
