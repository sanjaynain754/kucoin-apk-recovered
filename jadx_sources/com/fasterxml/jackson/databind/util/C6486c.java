package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.c */
/* JADX INFO: compiled from: ArrayIterator.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6486c<T> implements Iterator<T>, Iterable<T> {

    /* JADX INFO: renamed from: b */
    public final T[] f10720b;

    /* JADX INFO: renamed from: c */
    public int f10721c = 0;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10721c < this.f10720b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        int i11 = this.f10721c;
        T[] tArr = this.f10720b;
        if (i11 >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.f10721c = i11 + 1;
        return tArr[i11];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C6486c(T[] tArr) {
        this.f10720b = tArr;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }
}
