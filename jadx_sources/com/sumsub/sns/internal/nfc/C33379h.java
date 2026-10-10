package com.sumsub.sns.internal.nfc;

import org.jmrtd.PassportService;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33379h extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PassportService f68071a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f68072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33381j f68073c;

    /* JADX INFO: renamed from: d */
    public int f68074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33379h(C33381j c33381j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68073c = c33381j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68072b = obj;
        this.f68074d |= Integer.MIN_VALUE;
        return this.f68073c.m71680a((PassportService) null, this);
    }
}
