package com.sumsub.sns.internal.features.presentation.questionnaire;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32328x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65871a;

    /* JADX INFO: renamed from: b */
    public int f65872b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f65873c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32329y f65874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32328x(C32329y c32329y, Continuation continuation) {
        super(continuation);
        this.f65874d = c32329y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65871a = obj;
        this.f65872b |= Integer.MIN_VALUE;
        return this.f65874d.emit(null, this);
    }
}
