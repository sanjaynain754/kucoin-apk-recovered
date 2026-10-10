package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.h1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31270h1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63348a;

    /* JADX INFO: renamed from: b */
    public int f63349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31274i1 f63350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31270h1(C31274i1 c31274i1, Continuation continuation) {
        super(continuation);
        this.f63350c = c31274i1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63348a = obj;
        this.f63349b |= Integer.MIN_VALUE;
        return this.f63350c.emit(null, this);
    }
}
