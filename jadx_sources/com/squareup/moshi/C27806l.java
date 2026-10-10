package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.squareup.moshi.l */
/* JADX INFO: compiled from: JsonValueWriter.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27806l extends AbstractC27807m {

    /* JADX INFO: renamed from: k */
    public Object[] f56616k = new Object[32];

    /* JADX INFO: renamed from: l */
    public String f56617l;

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: C */
    public AbstractC27807m mo68704C(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo68720z(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo68719x(number.doubleValue());
        }
        if (number == null) {
            return mo68718m();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(bigDecimal.toString());
        }
        m68721L(bigDecimal);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: E */
    public AbstractC27807m mo68705E(String str) throws IOException {
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(str);
        }
        m68721L(str);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: J */
    public AbstractC27807m mo68706J(boolean z11) throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        m68721L(Boolean.valueOf(z11));
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: a */
    public AbstractC27807m mo68713a() throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i11 = this.f56618b;
        int i12 = this.f56626j;
        if (i11 == i12 && this.f56619c[i11 - 1] == 1) {
            this.f56626j = ~i12;
            return this;
        }
        m68723g();
        ArrayList arrayList = new ArrayList();
        m68721L(arrayList);
        Object[] objArr = this.f56616k;
        int i13 = this.f56618b;
        objArr[i13] = arrayList;
        this.f56621e[i13] = 0;
        m68728q(1);
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: b */
    public AbstractC27807m mo68714b() throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i11 = this.f56618b;
        int i12 = this.f56626j;
        if (i11 == i12 && this.f56619c[i11 - 1] == 3) {
            this.f56626j = ~i12;
            return this;
        }
        m68723g();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        m68721L(linkedHashTreeMap);
        this.f56616k[this.f56618b] = linkedHashTreeMap;
        m68728q(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i11 = this.f56618b;
        if (i11 > 1 || (i11 == 1 && this.f56619c[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f56618b = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f56618b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: l */
    public AbstractC27807m mo68717l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f56618b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m68726o() != 3 || this.f56617l != null || this.f56625i) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f56617l = str;
        this.f56620d[this.f56618b - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: m */
    public AbstractC27807m mo68718m() throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        m68721L(null);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: x */
    public AbstractC27807m mo68719x(double d11) throws IOException {
        if (!this.f56623g && (Double.isNaN(d11) || d11 == Double.NEGATIVE_INFINITY || d11 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(Double.toString(d11));
        }
        m68721L(Double.valueOf(d11));
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: z */
    public AbstractC27807m mo68720z(long j11) throws IOException {
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(Long.toString(j11));
        }
        m68721L(Long.valueOf(j11));
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    public C27806l() {
        m68728q(6);
    }

    /* JADX INFO: renamed from: L */
    public final C27806l m68721L(Object obj) {
        String str;
        Object objPut;
        int iM68726o = m68726o();
        int i11 = this.f56618b;
        if (i11 == 1) {
            if (iM68726o == 6) {
                this.f56619c[i11 - 1] = 7;
                this.f56616k[i11 - 1] = obj;
                return this;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
        if (iM68726o == 3 && (str = this.f56617l) != null) {
            if ((obj == null && !this.f56624h) || (objPut = ((Map) this.f56616k[i11 - 1]).put(str, obj)) == null) {
                this.f56617l = null;
                return this;
            }
            throw new IllegalArgumentException("Map key '" + this.f56617l + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
        }
        if (iM68726o == 1) {
            ((List) this.f56616k[i11 - 1]).add(obj);
            return this;
        }
        if (iM68726o == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: h */
    public AbstractC27807m mo68715h() throws IOException {
        if (m68726o() == 1) {
            int i11 = this.f56618b;
            int i12 = this.f56626j;
            if (i11 == (~i12)) {
                this.f56626j = ~i12;
                return this;
            }
            int i13 = i11 - 1;
            this.f56618b = i13;
            this.f56616k[i13] = null;
            int[] iArr = this.f56621e;
            int i14 = i11 - 2;
            iArr[i14] = iArr[i14] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: i */
    public AbstractC27807m mo68716i() throws IOException {
        if (m68726o() == 3) {
            if (this.f56617l == null) {
                int i11 = this.f56618b;
                int i12 = this.f56626j;
                if (i11 == (~i12)) {
                    this.f56626j = ~i12;
                    return this;
                }
                this.f56625i = false;
                int i13 = i11 - 1;
                this.f56618b = i13;
                this.f56616k[i13] = null;
                this.f56620d[i13] = null;
                int[] iArr = this.f56621e;
                int i14 = i11 - 2;
                iArr[i14] = iArr[i14] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.f56617l);
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
