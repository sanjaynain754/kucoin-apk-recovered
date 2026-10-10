package com.sumsub.sns.internal.features.presentation.country.picker;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30898j extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62417a;

    /* JADX INFO: renamed from: b */
    public int f62418b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f62419c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30899k f62420d;

    /* JADX INFO: renamed from: e */
    public int f62421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30898j(C30899k c30899k, Continuation continuation) {
        super(continuation);
        this.f62420d = c30899k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62417a = obj;
        this.f62418b |= Integer.MIN_VALUE;
        return this.f62420d.emit(null, this);
    }
}
