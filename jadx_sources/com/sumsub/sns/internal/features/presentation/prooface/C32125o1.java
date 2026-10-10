package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.o1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32125o1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65401a;

    /* JADX INFO: renamed from: b */
    public int f65402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32129p1 f65403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32125o1(C32129p1 c32129p1, Continuation continuation) {
        super(continuation);
        this.f65403c = c32129p1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65401a = obj;
        this.f65402b |= Integer.MIN_VALUE;
        return this.f65403c.emit(null, this);
    }
}
