package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.presentation.otp.C31374b;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31527O extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f63992a;

    /* JADX INFO: renamed from: b */
    public C31374b f63993b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f63995d;

    /* JADX INFO: renamed from: e */
    public int f63996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31527O(C31707h0 c31707h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63995d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63994c = obj;
        this.f63996e |= Integer.MIN_VALUE;
        return this.f63995d.m70808a(0L, this);
    }
}
