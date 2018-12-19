<#import "parts/common.ftl" as c>

<@c.page>
    <h2>Trade ideas</h2>
    <#list ideas as idea>
        <div>
            <b>${idea.id}</b>
            <b>${idea.stock.ticket}</b>
            <span>${idea.startTime}</span>
            <span>${idea.startPrice}</span>
        </div>
    <#else>
    <b>No ideas</b>
    </#list>

</@c.page>