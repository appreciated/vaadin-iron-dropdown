package com.github.appreciated.dropdown;

public class Alignment {
    private final HorizontalAlignment horizontalAlignment;
    private final VerticalAlignment verticalAlignment;

    public Alignment(HorizontalAlignment hor, VerticalAlignment ver) {
        this.horizontalAlignment = hor;
        this.verticalAlignment = ver;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public VerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }
}
