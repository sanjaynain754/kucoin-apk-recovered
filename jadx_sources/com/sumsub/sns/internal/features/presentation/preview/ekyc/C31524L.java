package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31524L extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f63977a;

    /* JADX INFO: renamed from: b */
    public String f63978b;

    /* JADX INFO: renamed from: c */
    public String f63979c;

    /* JADX INFO: renamed from: d */
    public C30095b f63980d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63981e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31707h0 f63982f;

    /* JADX INFO: renamed from: g */
    public int f63983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31524L(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63982f = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63981e = obj;
        this.f63983g |= Integer.MIN_VALUE;
        return this.f63982f.m70816b(this);
    }
}
