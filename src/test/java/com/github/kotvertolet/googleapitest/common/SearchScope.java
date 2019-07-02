package com.github.kotvertolet.googleapitest.common;

public enum SearchScope {

    IN_TITLE(":intitle"),
    IN_AUTHOR(":inauthor"),
    IN_PUBLISHER(":inpublisher"),
    IN_SUBJECT(":subject"),
    IN_ISBN(":isbn"),
    IN_LCCN(":lccn"),
    IN_OCLC(":oclc");

    private String value;

    SearchScope(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
