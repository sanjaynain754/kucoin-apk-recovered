package com.sumsub.sns.internal.features.presentation.verification2.host;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32811G extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67142a;

    /* JADX INFO: renamed from: b */
    public int f67143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32812H f67144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32811G(C32812H c32812h, Continuation continuation) {
        super(continuation);
        this.f67144c = c32812h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67142a = obj;
        this.f67143b |= Integer.MIN_VALUE;
        return this.f67144c.emit(null, this);
    }
}
