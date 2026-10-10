package com.sumsub.sns.internal.core.common;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28506x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58035a;

    /* JADX INFO: renamed from: b */
    public int f58036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28509y f58037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28506x(C28509y c28509y, Continuation continuation) {
        super(continuation);
        this.f58037c = c28509y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58035a = obj;
        this.f58036b |= Integer.MIN_VALUE;
        return this.f58037c.emit(null, this);
    }
}
