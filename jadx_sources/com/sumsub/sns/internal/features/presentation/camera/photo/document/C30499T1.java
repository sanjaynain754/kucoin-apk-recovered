package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.T1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30499T1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f61579a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61580b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61581c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61582d;

    /* JADX INFO: renamed from: e */
    public int f61583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30499T1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61582d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61581c = obj;
        this.f61583e |= Integer.MIN_VALUE;
        return this.f61582d.m70305b(null, null, this);
    }
}
