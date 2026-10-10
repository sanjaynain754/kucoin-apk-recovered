package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32802x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67132a;

    /* JADX INFO: renamed from: b */
    public int f67133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32803y f67134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32802x(C32803y c32803y, Continuation continuation) {
        super(continuation);
        this.f67134c = c32803y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67132a = obj;
        this.f67133b |= Integer.MIN_VALUE;
        return this.f67134c.emit(null, this);
    }
}
