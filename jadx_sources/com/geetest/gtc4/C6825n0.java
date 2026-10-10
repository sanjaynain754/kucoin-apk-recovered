package com.geetest.gtc4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.geetest.gtc4.n0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6825n0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Object[] f11440a;

    /* JADX INFO: renamed from: b */
    public int f11441b = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11441b < this.f11440a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f11441b;
        Object[] objArr = this.f11440a;
        if (i11 != objArr.length) {
            this.f11441b = i11 + 1;
            return objArr[i11];
        }
        throw new NoSuchElementException("Out of elements: " + this.f11441b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }

    public C6825n0(Object[] objArr) {
        this.f11440a = objArr;
    }
}
