package com.google.api.client.util;

/* JADX INFO: loaded from: classes56.dex */
public final class Joiner {
    private final com.google.common.base.Joiner wrapped;

    /* JADX INFO: renamed from: on */
    public static Joiner m13335on(char c11) {
        return new Joiner(com.google.common.base.Joiner.m13372on(c11));
    }

    public final String join(Iterable<?> iterable) {
        return this.wrapped.join((Iterable<? extends Object>) iterable);
    }

    private Joiner(com.google.common.base.Joiner joiner) {
        this.wrapped = joiner;
    }
}
