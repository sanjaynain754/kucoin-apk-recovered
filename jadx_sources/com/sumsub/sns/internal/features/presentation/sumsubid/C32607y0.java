package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.features.presentation.otp.C31374b;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32607y0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66509a;

    /* JADX INFO: renamed from: b */
    public int f66510b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f66511c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32609z0 f66512d;

    /* JADX INFO: renamed from: e */
    public Long f66513e;

    /* JADX INFO: renamed from: f */
    public C31374b f66514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32607y0(C32609z0 c32609z0, Continuation continuation) {
        super(continuation);
        this.f66512d = c32609z0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66509a = obj;
        this.f66510b |= Integer.MIN_VALUE;
        return this.f66512d.emit(null, this);
    }
}
