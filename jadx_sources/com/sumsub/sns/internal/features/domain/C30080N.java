package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30080N extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29124h f60446a;

    /* JADX INFO: renamed from: b */
    public AbstractC29172p f60447b;

    /* JADX INFO: renamed from: c */
    public Object f60448c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60449d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30081O f60450e;

    /* JADX INFO: renamed from: f */
    public int f60451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30080N(C30081O c30081o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60450e = c30081o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60449d = obj;
        this.f60451f |= Integer.MIN_VALUE;
        return this.f60450e.m70105a(this);
    }
}
