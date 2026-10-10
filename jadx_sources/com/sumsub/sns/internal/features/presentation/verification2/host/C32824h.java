package com.sumsub.sns.internal.features.presentation.verification2.host;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32824h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67166a;

    /* JADX INFO: renamed from: b */
    public int f67167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32825i f67168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32824h(C32825i c32825i, Continuation continuation) {
        super(continuation);
        this.f67168c = c32825i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67166a = obj;
        this.f67167b |= Integer.MIN_VALUE;
        return this.f67168c.emit(null, this);
    }
}
