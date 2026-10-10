package com.sumsub.sns.internal.nfc;

import org.jmrtd.PassportService;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33380i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PassportService f68075a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f68076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33381j f68077c;

    /* JADX INFO: renamed from: d */
    public int f68078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33380i(C33381j c33381j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68077c = c33381j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68076b = obj;
        this.f68078d |= Integer.MIN_VALUE;
        return this.f68077c.m71682b(null, this);
    }
}
