package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.p139a.C34947a;
import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34960e implements Comparator {

    /* JADX INFO: renamed from: a */
    private static final C34960e f74687a = new C34960e();

    /* JADX INFO: renamed from: a */
    public static Comparator m76738a() {
        return f74687a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C34947a c34947a = (C34947a) obj;
        C34947a c34947a2 = (C34947a) obj2;
        int i11 = c34947a.f74592a;
        int i12 = c34947a2.f74592a;
        if (i11 < i12) {
            return -1;
        }
        if (i11 == i12) {
            return c34947a.f74593b - c34947a2.f74593b;
        }
        return 1;
    }

    private C34960e() {
    }
}
