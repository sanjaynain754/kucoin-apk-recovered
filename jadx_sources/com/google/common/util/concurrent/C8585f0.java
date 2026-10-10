package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8585f0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13695a(AtomicReferenceArray atomicReferenceArray, int i11, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }
}
