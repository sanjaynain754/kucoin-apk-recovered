package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a0 */
/* JADX INFO: compiled from: FetchState.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5677a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5712m<C46075i> f9258a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5733w0 f9259b;

    /* JADX INFO: renamed from: c */
    public long f9260c = 0;

    /* JADX INFO: renamed from: d */
    public int f9261d;

    /* JADX INFO: renamed from: e */
    public BytesRange f9262e;

    /* JADX INFO: renamed from: a */
    public InterfaceC5712m<C46075i> m9599a() {
        return this.f9258a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC5733w0 m9600b() {
        return this.f9259b;
    }

    /* JADX INFO: renamed from: c */
    public long m9601c() {
        return this.f9260c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC5737y0 m9602d() {
        return this.f9259b.mo9665g();
    }

    /* JADX INFO: renamed from: e */
    public int m9603e() {
        return this.f9261d;
    }

    /* JADX INFO: renamed from: f */
    public BytesRange m9604f() {
        return this.f9262e;
    }

    /* JADX INFO: renamed from: g */
    public Uri m9605g() {
        return this.f9259b.mo9666h().getSourceUri();
    }

    /* JADX INFO: renamed from: h */
    public void m9606h(long j11) {
        this.f9260c = j11;
    }

    /* JADX INFO: renamed from: i */
    public void m9607i(int i11) {
        this.f9261d = i11;
    }

    /* JADX INFO: renamed from: j */
    public void m9608j(BytesRange bytesRange) {
        this.f9262e = bytesRange;
    }

    public C5677a0(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        this.f9258a = interfaceC5712m;
        this.f9259b = interfaceC5733w0;
    }
}
