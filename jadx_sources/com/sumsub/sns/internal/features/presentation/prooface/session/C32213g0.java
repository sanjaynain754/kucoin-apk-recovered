package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32213g0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32173P f65619a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32239r0 f65621c;

    /* JADX INFO: renamed from: d */
    public int f65622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32213g0(C32239r0 c32239r0, Continuation continuation) {
        super(continuation);
        this.f65621c = c32239r0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65620b = obj;
        this.f65622d |= Integer.MIN_VALUE;
        return C32239r0.m71064a(this.f65621c, this);
    }
}
