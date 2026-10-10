package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class ImmutableList<E> extends ArrayList<E> {
    public ImmutableList(int i11) {
        super(i11);
    }

    public ImmutableList(List<E> list) {
        super(list);
    }

    public static <E> ImmutableList<E> copyOf(List<E> list) {
        return new ImmutableList<>(list);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m8531of(E... eArr) {
        ImmutableList<E> immutableList = new ImmutableList<>(eArr.length);
        Collections.addAll(immutableList, eArr);
        return immutableList;
    }
}
