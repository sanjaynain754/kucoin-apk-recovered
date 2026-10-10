package p008a6;

import android.util.SparseIntArray;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.h0 */
/* JADX INFO: compiled from: PoolParams.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0148h0 {

    /* JADX INFO: renamed from: a */
    public final int f514a;

    /* JADX INFO: renamed from: b */
    public final int f515b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f516c;

    /* JADX INFO: renamed from: d */
    public final int f517d;

    /* JADX INFO: renamed from: e */
    public final int f518e;

    /* JADX INFO: renamed from: f */
    public boolean f519f;

    /* JADX INFO: renamed from: g */
    public final int f520g;

    public C0148h0(int i11, int i12, SparseIntArray sparseIntArray) {
        this(i11, i12, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C0148h0(int i11, int i12, SparseIntArray sparseIntArray, int i13, int i14, int i15) {
        C45708h.m100898i(i11 >= 0 && i12 >= i11);
        this.f515b = i11;
        this.f514a = i12;
        this.f516c = sparseIntArray;
        this.f517d = i13;
        this.f518e = i14;
        this.f520g = i15;
    }
}
