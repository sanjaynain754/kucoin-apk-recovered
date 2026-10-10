package com.sumsub.sns.internal.core.domain;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28586l extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58196a;

    /* JADX INFO: renamed from: b */
    public int f58197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28588m f58198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28586l(C28588m c28588m, Continuation continuation) {
        super(continuation);
        this.f58198c = c28588m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58196a = obj;
        this.f58197b |= Integer.MIN_VALUE;
        return this.f58198c.emit(null, this);
    }
}
