package androidx.camera.view;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.view.t */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1454t {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2255a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
