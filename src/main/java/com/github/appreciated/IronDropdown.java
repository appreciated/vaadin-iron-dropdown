package com.github.appreciated;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import elemental.json.JsonFactory;
import elemental.json.impl.JreJsonFactory;
import gwt.FluentJreJsonArray;
import gwt.FluentJreJsonObject;

@Tag("iron-dropdown")
@HtmlImport("bower_components/web-animations-js/web-animations-next.min.html")
@HtmlImport("bower_components/iron-dropdown/demo/x-select.html")

public class IronDropdown extends Component {

    public IronDropdown(Component content) {
        getElement()
                .setAttribute("horizontal-align", "right")
                .setAttribute("vertical-align", "top");

        /** Taken from the iron-dropdown demo
         *
         * https://github.com/PolymerElements/iron-dropdown/blob/master/demo/x-select.html
         *
         * Settings the animation configuration doesnt work?
         * openAnimationConfig: {
         *             type: Array,
         *             value: function() {
         *               return [{
         *                 name: 'fade-in-animation',
         *                 timing: {
         *                   delay: 150,
         *                   duration: 50
         *                 }
         *               }, {
         *                 name: 'expand-animation',
         *                 timing: {
         *                   delay: 150,
         *                   duration: 200
         *                 }
         *               }];
         *             }
         *           },
         *           closeAnimationConfig: {
         *             type: Array,
         *             value: function() {
         *               return [{
         *                 name: 'fade-out-animation',
         *                 timing: {
         *                   duration: 200
         *                 }
         *               }];
         *             }
         *           }
         *         },
         */

        getElement().setAttribute("open-animation-config", "[[openAnimationConfig]]");
        getElement().setAttribute("close-animation-config", "[[closeAnimationConfig]]");

        /**
         * FluentJreJsonObject and FluentJreJsonArray are basically the same as elemental.json.impl.JreJsonObject and
         * elemental.json.impl.JreJsonArray just to make its api more "fluent"
         */
        JsonFactory factory = new JreJsonFactory();
        getElement().setPropertyJson("properties", new FluentJreJsonObject(factory)
                .putFluent("openAnimationConfig",
                        new FluentJreJsonObject(factory)
                                .putFluent("type", "Array")
                                .putFluent("value",
                                        new FluentJreJsonArray(factory)
                                                .setFluent(0,
                                                        new FluentJreJsonObject(factory)
                                                                .putFluent("name", "fade-in-animation")
                                                                .putFluent("timing",
                                                                        new FluentJreJsonObject(factory)
                                                                                .putFluent("delay", 150)
                                                                                .putFluent("duration", 50)
                                                                )
                                                )
                                                .setFluent(1,
                                                        new FluentJreJsonObject(factory)
                                                                .putFluent("name", "expand-animation")
                                                                .putFluent("timing",
                                                                        new FluentJreJsonObject(factory)
                                                                                .putFluent("delay", 150)
                                                                                .putFluent("duration", 200)
                                                                )
                                                )
                                )
                ).putFluent("closeAnimationConfig",
                        new FluentJreJsonObject(factory)
                                .putFluent("type", "Array")
                                .putFluent("value",
                                        new FluentJreJsonArray(factory)
                                                .setFluent(0,
                                                        new FluentJreJsonObject(factory)
                                                                .putFluent("name", "fade-out-animation")
                                                                .putFluent("timing",
                                                                        new FluentJreJsonObject(factory)
                                                                                .putFluent("duration", 50)
                                                                )
                                                )
                                )
                )
        );

        getElement().appendChild(content.getElement());
    }
}
