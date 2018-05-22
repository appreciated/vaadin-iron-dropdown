package com.github.appreciated;

import com.github.appreciated.dropdown.IronDropdownWrapper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        HorizontalLayout content = new HorizontalLayout();
        content.setWidth("300px");
        content.setHeight("300px");
        content.getElement().getStyle().set("background", "red");
        add(
                new HorizontalLayout(
                        new IronDropdownWrapper(
                                new Button("Open"),
                                content
                        ))
        );
    }
}
