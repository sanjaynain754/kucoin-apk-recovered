package com.sumsub.sns.internal.nfc;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33385n extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f68086a;

    /* JADX INFO: renamed from: b */
    public int f68087b;

    /* JADX INFO: renamed from: c */
    public int f68088c;

    /* JADX INFO: renamed from: d */
    public Function0 f68089d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f68090e;

    /* JADX INFO: renamed from: f */
    public int f68091f;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68090e = obj;
        this.f68091f |= Integer.MIN_VALUE;
        return AbstractC33386o.m71683a(0, 0, null, this);
    }

    public C33385n(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
