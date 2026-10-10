package com.sumsub.sns.internal.core.analytics;

import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28377p extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28378q f57862b;

    /* JADX INFO: renamed from: c */
    public int f57863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28377p(C28378q c28378q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57862b = c28378q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57861a = obj;
        this.f57863c |= Integer.MIN_VALUE;
        return this.f57862b.send((List) null, this);
    }
}
