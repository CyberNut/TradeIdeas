<#macro currencyList>
    <h2>Currencies</h2>
    <#list currencies as currency>
        <div>
            <b>${currency.id}</b>
            <span>${currency.code}</span>
            <b>${currency.name}</b>
        </div>
    <#else>
    <b>No currencies</b>
    </#list>
</#macro>

<#macro rates>
    <h3>Currency rates</h3>
    <#list currencyRates as currencyRate>
        <div>
            <b>${currencyRate.date}</b>
            <span>${currencyRate.currency.code}</span>
            <b>${currencyRate.rate}</b>
            <b>${currencyRate.multiplicity}</b>
        </div>
    </#list>
</#macro>
