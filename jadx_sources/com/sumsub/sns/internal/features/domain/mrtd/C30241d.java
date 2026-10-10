package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30241d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60782a;

    /* JADX INFO: renamed from: b */
    public String f60783b;

    /* JADX INFO: renamed from: c */
    public MRTDError f60784c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60785d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30243e f60786e;

    /* JADX INFO: renamed from: f */
    public int f60787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30241d(C30243e c30243e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60786e = c30243e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60785d = obj;
        this.f60787f |= Integer.MIN_VALUE;
        return this.f60786e.m70153a(null, null, this);
    }
}
