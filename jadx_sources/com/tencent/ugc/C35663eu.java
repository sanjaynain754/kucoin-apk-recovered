package com.tencent.ugc;

import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.ugc.eu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C35663eu implements Comparator {

    /* JADX INFO: renamed from: a */
    private static final C35663eu f77056a = new C35663eu();

    /* JADX INFO: renamed from: a */
    public static Comparator m79157a() {
        return f77056a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return UGCMediaListSource.lambda$updateSpeedInfoToClips$2((TXVideoEditConstants.TXSpeed) obj, (TXVideoEditConstants.TXSpeed) obj2);
    }

    private C35663eu() {
    }
}
