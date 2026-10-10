package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes45.dex */
public final /* synthetic */ class C7069a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m12906a(Unsafe unsafe, Object obj, long j11, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j11, obj2, obj3)) {
            if (unsafe.getObject(obj, j11) != obj2) {
                return false;
            }
        }
        return true;
    }
}
