package com.tencent.ugc;

import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.ugc.et */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35662et implements Comparator {

    /* JADX INFO: renamed from: a */
    private static final C35662et f77055a = new C35662et();

    /* JADX INFO: renamed from: a */
    public static Comparator m79156a() {
        return f77055a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return UGCMediaListSource.lambda$cutSingleVideoFileToClips$1((TXVideoEditConstants.TXRepeat) obj, (TXVideoEditConstants.TXRepeat) obj2);
    }

    private C35662et() {
    }
}
