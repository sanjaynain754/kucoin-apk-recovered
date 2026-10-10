package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.t1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32258t1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65715a;

    /* JADX INFO: renamed from: b */
    public int f65716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32262u1 f65717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32258t1(C32262u1 c32262u1, Continuation continuation) {
        super(continuation);
        this.f65717c = c32262u1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65715a = obj;
        this.f65716b |= Integer.MIN_VALUE;
        return this.f65717c.emit(null, this);
    }
}
