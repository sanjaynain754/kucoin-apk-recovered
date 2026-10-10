package com.sumsub.sns.internal.features.presentation.camera.video;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30787t extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f62199a;

    /* JADX INFO: renamed from: b */
    public String f62200b;

    /* JADX INFO: renamed from: c */
    public String f62201c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62202d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30763G f62203e;

    /* JADX INFO: renamed from: f */
    public int f62204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30787t(C30763G c30763g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62203e = c30763g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62202d = obj;
        this.f62204f |= Integer.MIN_VALUE;
        return this.f62203e.m70448a(this);
    }
}
