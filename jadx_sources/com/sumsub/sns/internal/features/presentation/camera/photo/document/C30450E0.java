package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30450E0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f61384a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61385b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61386c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30444C2 f61387d;

    /* JADX INFO: renamed from: e */
    public int f61388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30450E0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61387d = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61386c = obj;
        this.f61388e |= Integer.MIN_VALUE;
        return this.f61387d.m70346b(null, null, this);
    }
}
