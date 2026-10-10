package com.sumsub.sns.internal.core.presentation.screen.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28930n extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58818a;

    /* JADX INFO: renamed from: b */
    public int f58819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28931o f58820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28930n(C28931o c28931o, Continuation continuation) {
        super(continuation);
        this.f58820c = c28931o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58818a = obj;
        this.f58819b |= Integer.MIN_VALUE;
        return this.f58820c.emit(null, this);
    }
}
