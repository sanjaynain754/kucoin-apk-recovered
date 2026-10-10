package com.sumsub.sns.internal.features.presentation.esign;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30959N extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f62558a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30997n0 f62560c;

    /* JADX INFO: renamed from: d */
    public int f62561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30959N(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62560c = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62559b = obj;
        this.f62561d |= Integer.MIN_VALUE;
        return this.f62560c.m70553b(this);
    }
}
