package com.sumsub.sns.internal.features.presentation.country.picker;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30895g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62412a;

    /* JADX INFO: renamed from: b */
    public int f62413b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30896h f62414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30895g(C30896h c30896h, Continuation continuation) {
        super(continuation);
        this.f62414c = c30896h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62412a = obj;
        this.f62413b |= Integer.MIN_VALUE;
        return this.f62414c.emit(null, this);
    }
}
