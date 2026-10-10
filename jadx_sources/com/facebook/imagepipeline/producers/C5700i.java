package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p712w3.C45708h;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i */
/* JADX INFO: compiled from: BitmapPrepareProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5700i implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> f9353a;

    /* JADX INFO: renamed from: b */
    public final int f9354b;

    /* JADX INFO: renamed from: c */
    public final int f9355c;

    /* JADX INFO: renamed from: d */
    public final boolean f9356d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    /* JADX INFO: compiled from: BitmapPrepareProducer.java */
    public static class a extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c */
        public final int f9357c;

        /* JADX INFO: renamed from: d */
        public final int f9358d;

        /* JADX INFO: renamed from: p */
        public final void m9706p(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            InterfaceC46071e interfaceC46071eM565l;
            Bitmap bitmapMo101544K;
            int rowBytes;
            if (abstractC0110a == null || !abstractC0110a.mo567n() || (interfaceC46071eM565l = abstractC0110a.m565l()) == null || interfaceC46071eM565l.isClosed() || !(interfaceC46071eM565l instanceof InterfaceC46072f) || (bitmapMo101544K = ((InterfaceC46072f) interfaceC46071eM565l).mo101544K()) == null || (rowBytes = bitmapMo101544K.getRowBytes() * bitmapMo101544K.getHeight()) < this.f9357c || rowBytes > this.f9358d) {
                return;
            }
            bitmapMo101544K.prepareToDraw();
        }

        public a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, int i11, int i12) {
            super(interfaceC5712m);
            this.f9357c = i11;
            this.f9358d = i12;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            m9706p(abstractC0110a);
            m9801o().mo9652b(abstractC0110a, i11);
        }
    }

    public C5700i(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0, int i11, int i12, boolean z11) {
        boolean z12;
        if (i11 <= i12) {
            z12 = true;
        } else {
            z12 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z12));
        this.f9353a = (InterfaceC5731v0) C45708h.m100896g(interfaceC5731v0);
        this.f9354b = i11;
        this.f9355c = i12;
        this.f9356d = z11;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        if (interfaceC5733w0.mo9672n() && !this.f9356d) {
            this.f9353a.mo9524a(interfaceC5712m, interfaceC5733w0);
        } else {
            this.f9353a.mo9524a(new a(interfaceC5712m, this.f9354b, this.f9355c), interfaceC5733w0);
        }
    }
}
