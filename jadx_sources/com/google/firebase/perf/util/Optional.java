package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Optional<T> {
    private final T value;

    private Optional() {
        this.value = null;
    }

    public static <T> Optional<T> absent() {
        return new Optional<>();
    }

    public static <T> Optional<T> fromNullable(T t11) {
        return t11 == null ? absent() : m13846of(t11);
    }

    /* JADX INFO: renamed from: of */
    public static <T> Optional<T> m13846of(T t11) {
        return new Optional<>(t11);
    }

    public T get() {
        T t11 = this.value;
        if (t11 != null) {
            return t11;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isAvailable() {
        return this.value != null;
    }

    private Optional(T t11) {
        if (t11 != null) {
            this.value = t11;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
