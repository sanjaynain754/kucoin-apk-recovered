package p749x5;

import p747x3.C45999a;

/* JADX INFO: renamed from: x5.g */
/* JADX INFO: compiled from: DefaultCloseableImage.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC46073g extends AbstractC46067a {
    private static final String TAG = "CloseableImage";

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        C45999a.m101490K(TAG, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
