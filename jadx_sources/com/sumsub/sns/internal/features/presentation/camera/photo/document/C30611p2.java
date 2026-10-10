package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.p2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30611p2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f61843a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61844b;

    /* JADX INFO: renamed from: c */
    public Object f61845c;

    /* JADX INFO: renamed from: d */
    public int f61846d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f61847e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30440B2 f61848f;

    /* JADX INFO: renamed from: g */
    public int f61849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30611p2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61848f = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61847e = obj;
        this.f61849g |= Integer.MIN_VALUE;
        return this.f61848f.m70284a((Context) null, (Bitmap) null, (Rect) null, (C30556g1) null, this);
    }
}
