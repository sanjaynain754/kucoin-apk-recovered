package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29973b;
import com.sumsub.sns.internal.features.domain.appdata.C30098e;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30047m extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f60362a;

    /* JADX INFO: renamed from: b */
    public C30098e f60363b;

    /* JADX INFO: renamed from: c */
    public C29973b f60364c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60365d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30050p f60366e;

    /* JADX INFO: renamed from: f */
    public int f60367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30047m(C30050p c30050p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60366e = c30050p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60365d = obj;
        this.f60367f |= Integer.MIN_VALUE;
        return this.f60366e.m70077a(null, null, this);
    }
}
