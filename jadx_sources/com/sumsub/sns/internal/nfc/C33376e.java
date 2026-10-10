package com.sumsub.sns.internal.nfc;

import org.jmrtd.PassportService;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33376e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f68049a;

    /* JADX INFO: renamed from: b */
    public PassportService f68050b;

    /* JADX INFO: renamed from: c */
    public int f68051c;

    /* JADX INFO: renamed from: d */
    public boolean f68052d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f68053e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C33381j f68054f;

    /* JADX INFO: renamed from: g */
    public int f68055g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33376e(C33381j c33381j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68054f = c33381j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68053e = obj;
        this.f68055g |= Integer.MIN_VALUE;
        return this.f68054f.m71678a((Function1) null, this);
    }
}
