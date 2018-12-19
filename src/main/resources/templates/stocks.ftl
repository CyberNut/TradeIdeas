<#import "parts/common.ftl" as c>

<@c.page>
    <h2>Stocks</h2>
    <#list stocks as stock>
        <div>
            <b>${stock.ticket}</b>
            <span>${stock.name}</span>
            <b>${stock.currency.code}</b>
        </div>
    <#else>
    <b>No stocks</b>
    </#list>

</@c.page>