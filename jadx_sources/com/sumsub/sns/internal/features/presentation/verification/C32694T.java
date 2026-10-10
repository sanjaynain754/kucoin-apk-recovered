package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32694T extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f66835a;

    /* JADX INFO: renamed from: b */
    public String f66836b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66837c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66838d;

    /* JADX INFO: renamed from: e */
    public int f66839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32694T(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66838d = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66837c = obj;
        this.f66839e |= Integer.MIN_VALUE;
        return this.f66838d.m71302a((C29570k0) null, this);
    }
}
