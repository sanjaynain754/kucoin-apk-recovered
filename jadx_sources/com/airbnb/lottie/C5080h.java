package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p297h1.C38072b;
import p297h1.C38073c;
import p297h1.C38077g;
import p484o1.C42924f;
import p484o1.C42929k;
import p484o1.C42930l;

/* JADX INFO: renamed from: com.airbnb.lottie.h */
/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes.dex */
public class C5080h {

    /* JADX INFO: renamed from: c */
    public Map<String, List<Layer>> f5957c;

    /* JADX INFO: renamed from: d */
    public Map<String, C5083i0> f5958d;

    /* JADX INFO: renamed from: e */
    public float f5959e;

    /* JADX INFO: renamed from: f */
    public Map<String, C38072b> f5960f;

    /* JADX INFO: renamed from: g */
    public List<C38077g> f5961g;

    /* JADX INFO: renamed from: h */
    public SparseArrayCompat<C38073c> f5962h;

    /* JADX INFO: renamed from: i */
    public LongSparseArray<Layer> f5963i;

    /* JADX INFO: renamed from: j */
    public List<Layer> f5964j;

    /* JADX INFO: renamed from: k */
    public Rect f5965k;

    /* JADX INFO: renamed from: l */
    public float f5966l;

    /* JADX INFO: renamed from: m */
    public float f5967m;

    /* JADX INFO: renamed from: n */
    public float f5968n;

    /* JADX INFO: renamed from: o */
    public boolean f5969o;

    /* JADX INFO: renamed from: a */
    public final C5108r0 f5955a = new C5108r0();

    /* JADX INFO: renamed from: b */
    public final HashSet<String> f5956b = new HashSet<>();

    /* JADX INFO: renamed from: p */
    public int f5970p = 0;

    /* JADX INFO: renamed from: b */
    public Rect m5651b() {
        return this.f5965k;
    }

    /* JADX INFO: renamed from: c */
    public SparseArrayCompat<C38073c> m5652c() {
        return this.f5962h;
    }

    /* JADX INFO: renamed from: e */
    public float m5654e() {
        return this.f5967m - this.f5966l;
    }

    /* JADX INFO: renamed from: f */
    public float m5655f() {
        return this.f5967m;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, C38072b> m5656g() {
        return this.f5960f;
    }

    /* JADX INFO: renamed from: h */
    public float m5657h(float f11) {
        return C42929k.m94195i(this.f5966l, this.f5967m, f11);
    }

    /* JADX INFO: renamed from: i */
    public float m5658i() {
        return this.f5968n;
    }

    /* JADX INFO: renamed from: k */
    public List<Layer> m5660k() {
        return this.f5964j;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public C38077g m5661l(String str) {
        int size = this.f5961g.size();
        for (int i11 = 0; i11 < size; i11++) {
            C38077g c38077g = this.f5961g.get(i11);
            if (c38077g.m85977a(str)) {
                return c38077g;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: m */
    public int m5662m() {
        return this.f5970p;
    }

    /* JADX INFO: renamed from: n */
    public C5108r0 m5663n() {
        return this.f5955a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: o */
    public List<Layer> m5664o(String str) {
        return this.f5957c.get(str);
    }

    /* JADX INFO: renamed from: p */
    public float m5665p() {
        return this.f5966l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: q */
    public boolean m5666q() {
        return this.f5969o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: r */
    public void m5667r(int i11) {
        this.f5970p += i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: s */
    public void m5668s(Rect rect, float f11, float f12, float f13, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, C5083i0> map2, float f14, SparseArrayCompat<C38073c> sparseArrayCompat, Map<String, C38072b> map3, List<C38077g> list2) {
        this.f5965k = rect;
        this.f5966l = f11;
        this.f5967m = f12;
        this.f5968n = f13;
        this.f5964j = list;
        this.f5963i = longSparseArray;
        this.f5957c = map;
        this.f5958d = map2;
        this.f5959e = f14;
        this.f5962h = sparseArrayCompat;
        this.f5960f = map3;
        this.f5961g = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: t */
    public Layer m5669t(long j11) {
        return this.f5963i.get(j11);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f5964j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().m5766z("\t"));
        }
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: u */
    public void m5670u(boolean z11) {
        this.f5969o = z11;
    }

    /* JADX INFO: renamed from: v */
    public void m5671v(boolean z11) {
        this.f5955a.m5900b(z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public void m5650a(String str) {
        C42924f.m94158c(str);
        this.f5956b.add(str);
    }

    /* JADX INFO: renamed from: d */
    public float m5653d() {
        return (long) ((m5654e() / this.f5968n) * 1000.0f);
    }

    /* JADX INFO: renamed from: j */
    public Map<String, C5083i0> m5659j() {
        float fM94202e = C42930l.m94202e();
        if (fM94202e != this.f5959e) {
            for (Map.Entry<String, C5083i0> entry : this.f5958d.entrySet()) {
                this.f5958d.put(entry.getKey(), entry.getValue().m5672a(this.f5959e / fM94202e));
            }
        }
        this.f5959e = fM94202e;
        return this.f5958d;
    }
}
