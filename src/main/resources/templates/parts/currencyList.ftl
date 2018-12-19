<#macro currencyList>
    <h2>Currencies</h2>
    <div class="container">
        <div class="row">
            <div class="col-sm">
                <b>Currency</b>
            </div>
            <div class="col-sm">
                <b>Code</b>
            </div>
            <div class="col-sm">
                <b>Number</b>
            </div>
        </div>
        <#list currencies as currency>
            <div class="row">
                <div class="col-sm">${currency.name}</div>
                <div class="col-sm">${currency.code}</div>
                <div class="col-sm">${currency.id}</div>
            </div>
        <#else>
        <b>No currencies</b>
        </#list>
    </div>
</#macro>

<#macro rates>
    <h3>Currency rates</h3>
    <div class="container">
        <div class="row">
            <div class="col-sm">
                <b>Date</b>
            </div>
            <div class="col-sm">
                <b>Currency</b>
            </div>
            <div class="col-sm">
                <b>Rate</b>
            </div>
            <div class="col-sm">
                <b>Multiplicity</b>
            </div>
        </div>
        <#list currencyRates as currencyRate>
            <div class="row">
                <div class="col-sm">${currencyRate.date}</div>
                <div class="col-sm">${currencyRate.currency.code}</div>
                <div class="col-sm">${currencyRate.rate}</div>
                <div class="col-sm">${currencyRate.multiplicity}</div>
            </div>
        <#else>
        <b>No rates</b>
        </#list>
    </div>
</#macro>
