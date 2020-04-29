package com.linkset.LinksetAPI.model;

public enum LabelColor {
    GREEN("#08C8A0"),
    YELLOW("#FC5961"),
    RED("#FC5961");

    private String hexValue;

    LabelColor(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }

    @Override
    public String toString() {
        return hexValue;
    }
}
