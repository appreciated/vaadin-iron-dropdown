package com.github.appreciated;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(
                new IronDropdownWrapper(
                        new Button("Open"),
                        new Span("I am a textspan")
                )
        );
    }
}
