package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.y1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30656y1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f61947a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61948b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61949c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61950d;

    /* JADX INFO: renamed from: e */
    public int f61951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30656y1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61950d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61949c = obj;
        this.f61951e |= Integer.MIN_VALUE;
        return this.f61950d.m70286a((Context) null, (Bitmap) null, this);
    }
}
