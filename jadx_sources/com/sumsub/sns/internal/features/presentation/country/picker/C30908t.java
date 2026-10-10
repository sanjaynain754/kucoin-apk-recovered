package com.sumsub.sns.internal.features.presentation.country.picker;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30908t extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62441a;

    /* JADX INFO: renamed from: b */
    public int f62442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30909u f62443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30908t(C30909u c30909u, Continuation continuation) {
        super(continuation);
        this.f62443c = c30909u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62441a = obj;
        this.f62442b |= Integer.MIN_VALUE;
        return this.f62443c.emit(null, this);
    }
}
