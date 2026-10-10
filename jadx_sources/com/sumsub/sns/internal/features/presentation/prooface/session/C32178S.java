package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32178S extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f65528a;

    /* JADX INFO: renamed from: b */
    public int f65529b;

    /* JADX INFO: renamed from: c */
    public String f65530c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f65531d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32198b0 f65532e;

    /* JADX INFO: renamed from: f */
    public int f65533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32178S(C32198b0 c32198b0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65532e = c32198b0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65531d = obj;
        this.f65533f |= Integer.MIN_VALUE;
        return this.f65532e.m71055a(this);
    }
}
