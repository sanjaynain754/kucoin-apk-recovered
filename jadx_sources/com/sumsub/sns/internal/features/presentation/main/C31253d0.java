package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31253d0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63295a;

    /* JADX INFO: renamed from: b */
    public Document f63296b;

    /* JADX INFO: renamed from: c */
    public C31168B1 f63297c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63298d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31332p0 f63299e;

    /* JADX INFO: renamed from: f */
    public int f63300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31253d0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63299e = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63298d = obj;
        this.f63300f |= Integer.MIN_VALUE;
        return this.f63299e.m70690a(false, (ContinuationImpl) this);
    }
}
