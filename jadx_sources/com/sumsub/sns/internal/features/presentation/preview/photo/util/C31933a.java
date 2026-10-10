package com.sumsub.sns.internal.features.presentation.preview.photo.util;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.util.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31933a extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64920a;

    /* JADX INFO: renamed from: b */
    public int f64921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31934b f64922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31933a(C31934b c31934b, Continuation continuation) {
        super(continuation);
        this.f64922c = c31934b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f64920a = obj;
        this.f64921b |= Integer.MIN_VALUE;
        return this.f64922c.emit(null, this);
    }
}
