package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29779o;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30957L extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f62550a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62552c;

    /* JADX INFO: renamed from: d */
    public int f62553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30957L(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62552c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62551b = obj;
        this.f62553d |= Integer.MIN_VALUE;
        return this.f62552c.m70552b((C29779o) null, this);
    }
}
