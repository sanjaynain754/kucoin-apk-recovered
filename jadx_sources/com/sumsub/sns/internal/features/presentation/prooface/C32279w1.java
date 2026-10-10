package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.w1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32279w1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65749a;

    /* JADX INFO: renamed from: b */
    public int f65750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32282x1 f65751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32279w1(C32282x1 c32282x1, Continuation continuation) {
        super(continuation);
        this.f65751c = c32282x1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65749a = obj;
        this.f65750b |= Integer.MIN_VALUE;
        return this.f65751c.emit(null, this);
    }
}
