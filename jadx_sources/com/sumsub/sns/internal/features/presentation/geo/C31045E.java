package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import com.sumsub.sns.internal.features.domain.geo.C30191b;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31045E extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f62746a;

    /* JADX INFO: renamed from: b */
    public C30191b f62747b;

    /* JADX INFO: renamed from: c */
    public C31120v0 f62748c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62749d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31120v0 f62750e;

    /* JADX INFO: renamed from: f */
    public int f62751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31045E(C31120v0 c31120v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62750e = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62749d = obj;
        this.f62751f |= Integer.MIN_VALUE;
        return this.f62750e.m70581a((C29795e) null, this);
    }
}
