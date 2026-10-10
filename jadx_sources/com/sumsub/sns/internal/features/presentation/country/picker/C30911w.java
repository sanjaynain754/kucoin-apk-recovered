package com.sumsub.sns.internal.features.presentation.country.picker;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30911w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62446a;

    /* JADX INFO: renamed from: b */
    public int f62447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30912x f62448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30911w(C30912x c30912x, Continuation continuation) {
        super(continuation);
        this.f62448c = c30912x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62446a = obj;
        this.f62447b |= Integer.MIN_VALUE;
        return this.f62448c.emit(null, this);
    }
}
