package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32699Y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29570k0 f66857a;

    /* JADX INFO: renamed from: b */
    public String f66858b;

    /* JADX INFO: renamed from: c */
    public String f66859c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f66860d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32720j0 f66861e;

    /* JADX INFO: renamed from: f */
    public int f66862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32699Y(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66861e = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66860d = obj;
        this.f66862f |= Integer.MIN_VALUE;
        return C32720j0.m71296a(this.f66861e, (C29570k0) null, this);
    }
}
