package com.github.appreciated.dropdown;

public enum VerticalAlignment {
    TOP("top"), BOTTOM("bottom");

    private String alignment;

    VerticalAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getAlignment() {
        return alignment;
    }
}

