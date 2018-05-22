package com.github.appreciated.dropdown;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("iron-dropdown-wrapper")
@HtmlImport("bower_components/web-animations-js/web-animations-next.min.html")
@HtmlImport("bower_components/iron-dropdown/iron-dropdown.html")
@HtmlImport("src/iron-dropdown-animation.html")
@HtmlImport("src/iron-dropdown-wrapper.html")
public class IronDropdownWrapper extends PolymerTemplate<TemplateModel> {
    @Id("iron-dropdown-content")
    private Div content;

    @Id("iron-dropdown-button-wrapper")
    private Div buttonWrapper;

    public IronDropdownWrapper(Component button, Component content) {
        getElement().getStyle().set("width", "100px");
        getElement().getStyle().set("height", "100px");
        button.getElement().setAttribute("slot", "dropdown-trigger");
        content.getElement().setAttribute("slot", "dropdown-content");
        setButton(button);
        setContent(content);
    }

    public void setContent(Component content) {
        this.content.getElement().appendChild(content.getElement());
    }

    public void setButton(Component button) {
        buttonWrapper.getElement().appendChild(button.getElement());
    }

}
