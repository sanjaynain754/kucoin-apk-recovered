package com.fasterxml.jackson.core.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    public Separators() {
        this(':', ',', ',');
    }

    public Separators(char c11, char c12, char c13) {
        this.objectFieldValueSeparator = c11;
        this.objectEntrySeparator = c12;
        this.arrayValueSeparator = c13;
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public Separators withArrayValueSeparator(char c11) {
        return this.arrayValueSeparator == c11 ? this : new Separators(this.objectFieldValueSeparator, this.objectEntrySeparator, c11);
    }

    public Separators withObjectEntrySeparator(char c11) {
        return this.objectEntrySeparator == c11 ? this : new Separators(this.objectFieldValueSeparator, c11, this.arrayValueSeparator);
    }

    public Separators withObjectFieldValueSeparator(char c11) {
        return this.objectFieldValueSeparator == c11 ? this : new Separators(c11, this.objectEntrySeparator, this.arrayValueSeparator);
    }
}
