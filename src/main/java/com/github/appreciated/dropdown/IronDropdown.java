package com.github.appreciated.dropdown;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("iron-dropdown")
@HtmlImport("frontend://bower_components/iron-dropdown/iron-dropdown.html")
public class IronDropdown extends Component implements HasStyle {

    public void IronDropdown() {

    }
    public boolean isOpened() {
        return getParent().get().getElement().getProperty("opened", false);
    }

    public void refit() {
        getElement().callFunction("refit");
    }

}