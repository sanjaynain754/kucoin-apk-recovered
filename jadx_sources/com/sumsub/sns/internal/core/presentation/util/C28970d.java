package com.sumsub.sns.internal.core.presentation.util;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28970d extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        ((Number) obj).intValue();
        return ((Bitmap) obj2).getByteCount() / 1024;
    }

    public C28970d(int i11) {
        super(i11);
    }
}
