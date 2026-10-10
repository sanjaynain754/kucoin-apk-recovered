package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.remote.C29218G0;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30102b0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29218G0 f60517a;

    /* JADX INFO: renamed from: b */
    public C30104c0 f60518b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f60519c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30104c0 f60520d;

    /* JADX INFO: renamed from: e */
    public int f60521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30102b0(C30104c0 c30104c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60520d = c30104c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60519c = obj;
        this.f60521e |= Integer.MIN_VALUE;
        Object objM70113a = this.f60520d.m70113a(null, this);
        return objM70113a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70113a : Result.m103843boximpl(objM70113a);
    }
}
