package com.github.appreciated.dropdown;

/**
 * Note that the term "alignment" might be a little misleading in this case and note that I didn't come up with this myself
 * I simply took the term from the iron-dropdown api itself. .
 * From my perspective the alignment describes the anchor to which the IronDropdown will be bound.
 * F.e:
 * TOP - LEFT will in fact be bottom right as soon as the element is larger than the element it is bound to.
 *
 */
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
