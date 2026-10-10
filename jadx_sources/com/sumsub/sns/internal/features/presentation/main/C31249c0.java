package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31249c0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Document f63254a;

    /* JADX INFO: renamed from: b */
    public String f63255b;

    /* JADX INFO: renamed from: c */
    public C31168B1 f63256c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31332p0 f63258e;

    /* JADX INFO: renamed from: f */
    public int f63259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31249c0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63258e = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63257d = obj;
        this.f63259f |= Integer.MIN_VALUE;
        return this.f63258e.m70682a((Document) null, this);
    }
}
