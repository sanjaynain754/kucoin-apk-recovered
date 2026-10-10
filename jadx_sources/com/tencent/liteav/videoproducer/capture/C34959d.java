package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.Size;
import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34959d implements Comparator {

    /* JADX INFO: renamed from: a */
    private static final C34959d f74686a = new C34959d();

    /* JADX INFO: renamed from: a */
    public static Comparator m76737a() {
        return f74686a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Size) obj2).getArea() - ((Size) obj).getArea();
    }

    private C34959d() {
    }
}
