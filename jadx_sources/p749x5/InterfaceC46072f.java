package p749x5;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;

/* JADX INFO: renamed from: x5.f */
/* JADX INFO: compiled from: CloseableStaticBitmap.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC46072f extends InterfaceC46070d {
    /* JADX INFO: renamed from: G */
    static InterfaceC46072f m101550G(Bitmap bitmap, InterfaceC0117h<Bitmap> interfaceC0117h, InterfaceC46080n interfaceC46080n, int i11) {
        return m101552N(bitmap, interfaceC0117h, interfaceC46080n, i11, 0);
    }

    /* JADX INFO: renamed from: y */
    static InterfaceC46072f m101553y(AbstractC0110a<Bitmap> abstractC0110a, InterfaceC46080n interfaceC46080n, int i11) {
        return m101551I(abstractC0110a, interfaceC46080n, i11, 0);
    }

    /* JADX INFO: renamed from: F */
    int mo101543F();

    /* JADX INFO: renamed from: f */
    AbstractC0110a<Bitmap> mo101545f();

    /* JADX INFO: renamed from: t */
    int mo101547t();

    /* JADX INFO: renamed from: I */
    static InterfaceC46072f m101551I(AbstractC0110a<Bitmap> abstractC0110a, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        if (C46068b.m101542v()) {
            return new C46068b(abstractC0110a, interfaceC46080n, i11, i12);
        }
        return new C46074h(abstractC0110a, interfaceC46080n, i11, i12);
    }

    /* JADX INFO: renamed from: N */
    static InterfaceC46072f m101552N(Bitmap bitmap, InterfaceC0117h<Bitmap> interfaceC0117h, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        if (C46068b.m101542v()) {
            return new C46068b(bitmap, interfaceC0117h, interfaceC46080n, i11, i12);
        }
        return new C46074h(bitmap, interfaceC0117h, interfaceC46080n, i11, i12);
    }
}
