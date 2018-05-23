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
    private Div contentWrapper;

    @Id("iron-dropdown-button-wrapper")
    private Div buttonWrapper;

    @Id("dropdown")
    private IronDropdown dropdown;

    public IronDropdownWrapper(Component button, Component content) {
        this(button, content, new Alignment(HorizontalAlignment.LEFT, VerticalAlignment.BOTTOM));
    }

    public IronDropdownWrapper(Component button, Component content, Alignment alignment) {
        button.getElement().setAttribute("slot", "dropdown-trigger");
        content.getElement().setAttribute("slot", "dropdown-content-wrapper");
        content.getElement().getStyle().set("background-color", "var(--lumo-base-color)");
        setButton(button);
        setContent(content);
        setAlignment(alignment);
    }

    private void setAlignment(Alignment alignment) {
        dropdown.getElement().setAttribute("horizontal-align", alignment.getHorizontalAlignment().getAlignment());
        dropdown.getElement().setAttribute("vertical-align", alignment.getVerticalAlignment().getAlignment());
    }

    public void setContent(Component contentWrapper) {
        this.contentWrapper.getElement().appendChild(contentWrapper.getElement());
    }

    public void setButton(Component button) {
        buttonWrapper.getElement().appendChild(button.getElement());
    }

    /**
     * To allow to style the content wrapper
     *
     * @return
     */
    public Div getContentWrapper() {
        return contentWrapper;
    }

    /**
     * To allow to style the button wrapper
     *
     * @return
     */
    public Div getButtonWrapper() {
        return buttonWrapper;
    }

    /**
     * To allow to access the iron-dropdown element
     * @return
     */
    public IronDropdown getDropdown() {
        return dropdown;
    }
}
