package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;


public class IronDropdownWrapper extends Div {

    private IronDropdown dropDown;

    public IronDropdownWrapper(Component button, Component content) {
        button.getElement().setAttribute("slot", "dropdown-trigger");
        content.getElement().setAttribute("slot", "dropdown-content");
        setButton(button);
        setContent(content);
    }

    public void setContent(Component content) {
        content.getElement().setAttribute("slot", "dropdown-content");
        dropDown = new IronDropdown(content);
        dropDown.getElement().addSynchronizedProperty("opened");
        add(dropDown);
    }

    public void setButton(Component button) {
        button.getElement().setAttribute("slot", "dropdown-trigger");
        button.getElement().addEventListener("click", domEvent -> open());
        add(button);
    }

    public void open() {
        dropDown.getElement().callFunction("open");
    }
}
