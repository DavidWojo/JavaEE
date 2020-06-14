package com.example;

import java.util.stream.Collectors;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class StockSymbolDeleteHelper
{
	private String stockName;
	private StockSymbol stockSymbol;
	
	@Inject
	private StockIndex stockIndex;
	
	public void fetchItem()
	{
		List<StockSymbol> items = this.stockIndex.getList().stream().filter(i -> {
			return i.getName() == this.stockName;
		}).collect(Collectors.toList());
		if (items.isEmpty()) {
			this.stockName = null;
		} else {
			//this.itemName = items.get(0);
		}
	}
	
	
	public String removeItem()
	{
		this.stockIndex.getList().removeIf(item ->{
			return item.getName().equals(this.stockName);
		});
		return "list?faces-redirect=true";
	}
	
	
	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	
	public String getStockName()
	{
		return this.stockName;
	}
	
	public void setStockBean(StockSymbol stockBean)
	{
		this.stockSymbol = stockBean;
	}
	
	public StockSymbol getStockBean()
	{
		return this.stockSymbol;
	}

	
	public void setStockIndex(StockIndex stockIndex)
	{
		this.stockIndex = stockIndex;
	}
	
	public StockIndex getStockIndex()
	{
		return this.stockIndex;
	}
}
