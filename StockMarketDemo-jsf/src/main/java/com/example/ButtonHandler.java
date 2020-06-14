package com.example;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ButtonHandler implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private StockIndex stockIndex;

	public void printIt()
	{
	}
	
	public void clearList()
	{
		this.stockIndex.getList().clear();
	}
}
