package com.sumsub.sns.internal.p126ml.docdetector;

import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.docdetector.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33352c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f67994a;

    /* JADX INFO: renamed from: b */
    public Bitmap f67995b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C33353d f67997d;

    /* JADX INFO: renamed from: e */
    public int f67998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33352c(C33353d c33353d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67997d = c33353d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67996c = obj;
        this.f67998e |= Integer.MIN_VALUE;
        return this.f67997d.m71663a((Bitmap) null, false, (ContinuationImpl) this);
    }
}
