<#import "parts/common.ftl" as c>
<#import "parts/currencyList.ftl" as cl>

<@c.page>
    <@cl.currencyList/>
    <div>
        <p>Add new currency</p>
        <form method="post">
            <input type="text" name="id" placeholder="Currency Id" />
            <input type="text" name="code" placeholder="Symbol code" />
            <input type="text" name="name" placeholder="Currency name" />
            <button type="submit">Add</button>
        </form>
    </div>
    <br>
    <br>
    <@cl.rates/>
    <div>
        <p>Add new currencies rate</p>
        <form method="post" action="addRate">
            <input type="text" name="date" placeholder="dateTime" />
            <input type="text" name="code" placeholder="Currency code" />
            <input type="text" name="rate" placeholder="Currency rate" />
            <input type="text" name="multiplicity" placeholder="Currency multiplicity" />
            <button type="submit">Add rate</button>
        </form>
    </div>
</@c.page>