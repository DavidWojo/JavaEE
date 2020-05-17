package com.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class StartDemoButtonHandler implements Serializable
{
	private static final long serialVersionUID = 1L;

	public void printIt()
	{
		System.out.println("Event Handler");
	}
}
