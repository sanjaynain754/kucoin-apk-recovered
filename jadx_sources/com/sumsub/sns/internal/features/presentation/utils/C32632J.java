package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.domain.InterfaceC30271n0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32632J extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66592a;

    /* JADX INFO: renamed from: b */
    public Object f66593b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66594c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f66595d;

    /* JADX INFO: renamed from: e */
    public int f66596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32632J(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66595d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66594c = obj;
        this.f66596e |= Integer.MIN_VALUE;
        return this.f66595d.m71235a((Function2) null, (Function3) null, (InterfaceC30271n0) null, this);
    }
}
