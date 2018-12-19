package ru.cybernut.domain;

import javax.persistence.*;

@Entity
public class TradeIdea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private TypeOfTransaction typeOfTransaction;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stock_id")
    private Stock stock;
    private Long startTime;
    private Long endTime;
    private double valueOfPortfolio;
    private double startPrice;
    private double takeProfit;
    private double stopLoss;
    private double finishPrice;
    private boolean checked;
    private boolean successed;
    private boolean startByMarket;

    public TradeIdea() {

        this.checked = false;
        this.successed = false;
    }

    public TradeIdea(Stock stock, TypeOfTransaction typeOfTransaction, Long startTime) {
        this();
        this.typeOfTransaction = typeOfTransaction;
        this.stock = stock;
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getTakeProfit() {
        return takeProfit;
    }

    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public double getFinishPrice() {
        return finishPrice;
    }

    public void setFinishPrice(double finishPrice) {
        this.finishPrice = finishPrice;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isSuccessed() {
        return successed;
    }

    public void setSuccessed(boolean successed) {
        this.successed = successed;
    }

    public boolean isStartByMarket() {
        return startByMarket;
    }

    public void setStartByMarket(boolean startByMarket) {
        this.startByMarket = startByMarket;
    }

    public double getValueOfPortfolio() {
        return valueOfPortfolio;
    }

    public void setValueOfPortfolio(double valueOfPortfolio) {
        this.valueOfPortfolio = valueOfPortfolio;
    }
}
