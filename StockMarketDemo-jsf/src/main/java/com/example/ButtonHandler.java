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
	private StockListBean stockListBean;

	public void printIt()
	{
		System.out.println("Event Handler");
	}
	
	public void clearList()
	{
		this.stockListBean.getList().clear();
		System.out.println("Clearing List");
	}
}
