package com.sumsub.sns.internal.features.domain.fisherman;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30181e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f60654a;

    /* JADX INFO: renamed from: b */
    public int f60655b;

    /* JADX INFO: renamed from: c */
    public long f60656c;

    /* JADX INFO: renamed from: d */
    public Function1 f60657d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f60658e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30182f f60659f;

    /* JADX INFO: renamed from: g */
    public int f60660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30181e(C30182f c30182f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60659f = c30182f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60658e = obj;
        this.f60660g |= Integer.MIN_VALUE;
        return this.f60659f.m70131a(0, 0L, null, this);
    }
}
