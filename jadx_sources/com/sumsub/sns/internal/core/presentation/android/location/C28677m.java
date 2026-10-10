package com.sumsub.sns.internal.core.presentation.android.location;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28677m extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58312a;

    /* JADX INFO: renamed from: b */
    public int f58313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28678n f58314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28677m(C28678n c28678n, Continuation continuation) {
        super(continuation);
        this.f58314c = c28678n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58312a = obj;
        this.f58313b |= Integer.MIN_VALUE;
        return this.f58314c.emit(null, this);
    }
}
