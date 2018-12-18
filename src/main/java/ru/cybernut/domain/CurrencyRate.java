package ru.cybernut.domain;

import javax.persistence.*;

@Entity
public class CurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "currency_id")
    private Currency currency;
    private long date;
    private double rate;
    private double multiplicity;

    public CurrencyRate() {
    }

    public CurrencyRate(Currency currency, long date, double rate, double multiplicity) {
        this.currency = currency;
        this.date = date;
        this.rate = rate;
        this.multiplicity = multiplicity;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(double multiplicity) {
        this.multiplicity = multiplicity;
    }
}
