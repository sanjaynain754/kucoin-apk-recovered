package p749x5;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p747x3.C45999a;

/* JADX INFO: renamed from: x5.h */
/* JADX INFO: compiled from: DefaultCloseableStaticBitmap.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46074h extends C46068b {
    public C46074h(AbstractC0110a<Bitmap> abstractC0110a, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        super(abstractC0110a, interfaceC46080n, i11, i12);
    }

    public C46074h(Bitmap bitmap, InterfaceC0117h<Bitmap> interfaceC0117h, InterfaceC46080n interfaceC46080n, int i11, int i12) {
        super(bitmap, interfaceC0117h, interfaceC46080n, i11, i12);
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        C45999a.m101490K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
