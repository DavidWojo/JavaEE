package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class StockIndex implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private List<StockSymbol> list = new ArrayList<>();

	public List<StockSymbol> getList() {
		return this.list;
	}

	public void setList(List<StockSymbol> list) {
		this.list = list;
	}
	
	public StockIndex()
	{
		StockSymbol stockSymbolIBM = new StockSymbol();
		stockSymbolIBM.setName("IBM");
		stockSymbolIBM.setPrice(78.65);
		list.add(stockSymbolIBM);
		StockSymbol stockSymbolQCOM = new StockSymbol();
		stockSymbolQCOM.setName("QCOM");
		stockSymbolQCOM.setPrice(55.63);
		list.add(stockSymbolQCOM);
	}
}
