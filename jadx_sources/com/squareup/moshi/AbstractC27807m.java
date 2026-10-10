package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.squareup.moshi.m */
/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27807m implements Closeable, Flushable {

    /* JADX INFO: renamed from: f */
    public String f56622f;

    /* JADX INFO: renamed from: g */
    public boolean f56623g;

    /* JADX INFO: renamed from: h */
    public boolean f56624h;

    /* JADX INFO: renamed from: i */
    public boolean f56625i;

    /* JADX INFO: renamed from: b */
    public int f56618b = 0;

    /* JADX INFO: renamed from: c */
    public int[] f56619c = new int[32];

    /* JADX INFO: renamed from: d */
    public String[] f56620d = new String[32];

    /* JADX INFO: renamed from: e */
    public int[] f56621e = new int[32];

    /* JADX INFO: renamed from: j */
    public int f56626j = -1;

    /* JADX INFO: renamed from: C */
    public abstract AbstractC27807m mo68704C(Number number) throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract AbstractC27807m mo68705E(String str) throws IOException;

    /* JADX INFO: renamed from: J */
    public abstract AbstractC27807m mo68706J(boolean z11) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC27807m mo68713a() throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract AbstractC27807m mo68714b() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract AbstractC27807m mo68715h() throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract AbstractC27807m mo68716i() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract AbstractC27807m mo68717l(String str) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract AbstractC27807m mo68718m() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract AbstractC27807m mo68719x(double d11) throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract AbstractC27807m mo68720z(long j11) throws IOException;

    /* JADX INFO: renamed from: n */
    public static AbstractC27807m m68722n(BufferedSink bufferedSink) {
        return new C27805k(bufferedSink);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68723g() {
        int i11 = this.f56618b;
        int[] iArr = this.f56619c;
        if (i11 != iArr.length) {
            return false;
        }
        if (i11 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f56619c = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f56620d;
        this.f56620d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f56621e;
        this.f56621e = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof C27806l)) {
            return true;
        }
        C27806l c27806l = (C27806l) this;
        Object[] objArr = c27806l.f56616k;
        c27806l.f56616k = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public final String getPath() {
        return C27803i.m68686a(this.f56618b, this.f56619c, this.f56620d, this.f56621e);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m68724j() {
        return this.f56624h;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m68725k() {
        return this.f56623g;
    }

    /* JADX INFO: renamed from: o */
    public final int m68726o() {
        int i11 = this.f56618b;
        if (i11 != 0) {
            return this.f56619c[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: q */
    public final void m68728q(int i11) {
        int[] iArr = this.f56619c;
        int i12 = this.f56618b;
        this.f56618b = i12 + 1;
        iArr[i12] = i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m68729u(int i11) {
        this.f56619c[this.f56618b - 1] = i11;
    }

    /* JADX INFO: renamed from: v */
    public final void m68730v(boolean z11) {
        this.f56623g = z11;
    }

    /* JADX INFO: renamed from: w */
    public final void m68731w(boolean z11) {
        this.f56624h = z11;
    }

    /* JADX INFO: renamed from: p */
    public final void m68727p() throws IOException {
        int iM68726o = m68726o();
        if (iM68726o != 5 && iM68726o != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f56625i = true;
    }
}
