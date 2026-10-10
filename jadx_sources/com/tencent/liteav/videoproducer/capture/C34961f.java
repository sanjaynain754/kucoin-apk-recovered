package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.p139a.C34947a;
import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34961f implements Comparator {

    /* JADX INFO: renamed from: a */
    private static final C34961f f74688a = new C34961f();

    /* JADX INFO: renamed from: a */
    public static Comparator m76739a() {
        return f74688a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((C34947a) obj).f74593b - ((C34947a) obj2).f74593b;
    }

    private C34961f() {
    }
}
