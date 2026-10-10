package com.sumsub.sns.internal.nfc;

import org.jmrtd.PassportService;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33377f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public short f68056a;

    /* JADX INFO: renamed from: b */
    public String f68057b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f68058c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C33381j f68059d;

    /* JADX INFO: renamed from: e */
    public int f68060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33377f(C33381j c33381j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68059d = c33381j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68058c = obj;
        this.f68060e |= Integer.MIN_VALUE;
        return this.f68059d.m71681a((PassportService) null, (short) 0, (String) null, 0, 0, (ContinuationImpl) this);
    }
}
