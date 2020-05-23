package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class StockListBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private List<StockBean> list = new ArrayList<>();

	public List<StockBean> getList() {
		return this.list;
	}

	public void setList(List<StockBean> list) {
		this.list = list;
	}
	
	public StockListBean()
	{
		StockBean stockBeanIBM = new StockBean();
		stockBeanIBM.setName("IBM");
		stockBeanIBM.setPrice("78.65");
		list.add(stockBeanIBM);
		StockBean stockBeanQCOM = new StockBean();
		stockBeanQCOM.setName("QCOM");
		stockBeanQCOM.setPrice("55.63");
		list.add(stockBeanQCOM);
	}
}
