package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes59.dex */
final class MutableOnWriteList<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    List<T> mutableList;

    private Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.mutableList);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, T t11) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        this.mutableList.add(i11, t11);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i11) {
        return this.mutableList.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i11) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return this.mutableList.remove(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i11, T t11) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return this.mutableList.set(i11, t11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mutableList.size();
    }

    public MutableOnWriteList(List<T> list) {
        this.immutableList = list;
        this.mutableList = list;
    }
}
