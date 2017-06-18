package com.sofico.au.client;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
/**
 * This class is the entry point of car park application
 * @author kusu
 *
 */
@SpringUI(path="/carpark")
@Title("S S A C A R P A R K")
@Theme("valo")
public class CarParkMainUI extends UI{
	

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout rootLayout = new VerticalLayout();
		rootLayout.addComponent(new Label("This is the new change") );
		
		
		
		
		
		setContent(rootLayout);
		
	}

}
