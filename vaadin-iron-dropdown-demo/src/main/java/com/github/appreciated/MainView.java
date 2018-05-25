package com.github.appreciated;

import com.github.appreciated.dropdown.Alignment;
import com.github.appreciated.dropdown.HorizontalAlignment;
import com.github.appreciated.dropdown.IronDropdownWrapper;
import com.github.appreciated.dropdown.VerticalAlignment;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static com.github.appreciated.dropdown.HorizontalAlignment.LEFT;
import static com.github.appreciated.dropdown.HorizontalAlignment.RIGHT;
import static com.github.appreciated.dropdown.VerticalAlignment.BOTTOM;
import static com.github.appreciated.dropdown.VerticalAlignment.TOP;

/**
 * The main view contains a button and a template element.
 */
@Route("")
public class MainView extends Div {


    public MainView() {
        VerticalLayout contentHolder = new VerticalLayout(
                getIronDropDown(null,null), // Default constructor
                getIronDropDown(LEFT, BOTTOM),
                getIronDropDown(RIGHT, BOTTOM),
                getIronDropDown(LEFT, TOP),
                getIronDropDown(RIGHT, TOP)
        );
        contentHolder.setSizeFull();
        contentHolder.setAlignItems(FlexComponent.Alignment.CENTER);
        contentHolder.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        add(contentHolder);
        setSizeFull();
    }

    IronDropdownWrapper getIronDropDown(HorizontalAlignment hAlignment, VerticalAlignment valignment) {
        IronDropdownWrapper ironDropdown;
        if (hAlignment != null && valignment != null) {
            ironDropdown = new IronDropdownWrapper(
                    new Button("Open"),
                    getContentLayout(),
                    new Alignment(hAlignment, valignment)
            );
        } else {
            ironDropdown = new IronDropdownWrapper(
                    new Button("Open"),
                    getContentLayout()
            );
        }
        ironDropdown.getContentWrapper().getStyle().set("box-shadow", "0px 2px 6px #ccc");
        return ironDropdown;
    }


    public HorizontalLayout getContentLayout() {
        Span content = new Span("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.");
        content.setWidth("300px");
        content.setHeight("300px");
        return new HorizontalLayout(content);
    }


}
