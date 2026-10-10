package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.w1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30647w1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f61927a;

    /* JADX INFO: renamed from: b */
    public long f61928b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61930d;

    /* JADX INFO: renamed from: e */
    public int f61931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30647w1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61930d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61929c = obj;
        this.f61931e |= Integer.MIN_VALUE;
        return this.f61930d.m70290a((Bitmap) null, false, (ContinuationImpl) this);
    }
}
