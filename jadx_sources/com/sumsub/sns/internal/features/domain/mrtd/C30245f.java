package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29655v0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30245f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Document f60793a;

    /* JADX INFO: renamed from: b */
    public String f60794b;

    /* JADX INFO: renamed from: c */
    public String f60795c;

    /* JADX INFO: renamed from: d */
    public String f60796d;

    /* JADX INFO: renamed from: e */
    public C29655v0 f60797e;

    /* JADX INFO: renamed from: f */
    public boolean f60798f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f60799g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30251i f60800h;

    /* JADX INFO: renamed from: i */
    public int f60801i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30245f(C30251i c30251i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60800h = c30251i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60799g = obj;
        this.f60801i |= Integer.MIN_VALUE;
        return this.f60800h.m70156a(null, null, null, null, false, null, this);
    }
}
