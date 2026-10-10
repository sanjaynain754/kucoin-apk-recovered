package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31986B0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65026a;

    /* JADX INFO: renamed from: b */
    public int f65027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31989C0 f65028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31986B0(C31989C0 c31989c0, Continuation continuation) {
        super(continuation);
        this.f65028c = c31989c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65026a = obj;
        this.f65027b |= Integer.MIN_VALUE;
        return this.f65028c.emit(null, this);
    }
}
