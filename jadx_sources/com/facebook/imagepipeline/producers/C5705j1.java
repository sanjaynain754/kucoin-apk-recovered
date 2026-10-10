package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import p712w3.C45708h;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j1 */
/* JADX INFO: compiled from: ThumbnailBranchProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5705j1 implements InterfaceC5731v0<C46075i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5708k1<C46075i>[] f9371a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j1$a */
    /* JADX INFO: compiled from: ThumbnailBranchProducer.java */
    public class a extends AbstractC5724s<C46075i, C46075i> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5733w0 f9372c;

        /* JADX INFO: renamed from: d */
        public final int f9373d;

        /* JADX INFO: renamed from: e */
        public final ResizeOptions f9374e;

        public a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0, int i11) {
            super(interfaceC5712m);
            this.f9372c = interfaceC5733w0;
            this.f9373d = i11;
            this.f9374e = interfaceC5733w0.mo9666h().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable th2) {
            if (C5705j1.this.m9714e(this.f9373d + 1, m9801o(), this.f9372c)) {
                return;
            }
            m9801o().onFailure(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(C46075i c46075i, int i11) {
            if (c46075i != null && (AbstractC5682c.m9646e(i11) || C5711l1.m9738c(c46075i, this.f9374e))) {
                m9801o().mo9652b(c46075i, i11);
            } else if (AbstractC5682c.m9645d(i11)) {
                C46075i.m101556g(c46075i);
                if (C5705j1.this.m9714e(this.f9373d + 1, m9801o(), this.f9372c)) {
                    return;
                }
                m9801o().mo9652b(null, 1);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m9713d(int i11, ResizeOptions resizeOptions) {
        while (true) {
            InterfaceC5708k1<C46075i>[] interfaceC5708k1Arr = this.f9371a;
            if (i11 >= interfaceC5708k1Arr.length) {
                return -1;
            }
            if (interfaceC5708k1Arr[i11].mo9579b(resizeOptions)) {
                return i11;
            }
            i11++;
        }
    }

    public C5705j1(InterfaceC5708k1<C46075i>... interfaceC5708k1Arr) {
        InterfaceC5708k1<C46075i>[] interfaceC5708k1Arr2 = (InterfaceC5708k1[]) C45708h.m100896g(interfaceC5708k1Arr);
        this.f9371a = interfaceC5708k1Arr2;
        C45708h.m100894e(0, interfaceC5708k1Arr2.length);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        if (interfaceC5733w0.mo9666h().getResizeOptions() == null) {
            interfaceC5712m.mo9652b(null, 1);
        } else if (!m9714e(0, interfaceC5712m, interfaceC5733w0)) {
            interfaceC5712m.mo9652b(null, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9714e(int i11, InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        int iM9713d = m9713d(i11, interfaceC5733w0.mo9666h().getResizeOptions());
        if (iM9713d == -1) {
            return false;
        }
        this.f9371a[iM9713d].mo9524a(new a(interfaceC5712m, interfaceC5733w0, iM9713d), interfaceC5733w0);
        return true;
    }
}
