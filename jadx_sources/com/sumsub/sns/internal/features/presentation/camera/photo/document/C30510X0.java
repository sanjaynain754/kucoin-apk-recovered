package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.X0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30510X0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f61602a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61603b;

    /* JADX INFO: renamed from: c */
    public Object f61604c;

    /* JADX INFO: renamed from: d */
    public int f61605d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f61606e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30444C2 f61607f;

    /* JADX INFO: renamed from: g */
    public int f61608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30510X0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61607f = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61606e = obj;
        this.f61608g |= Integer.MIN_VALUE;
        return this.f61607f.m70329a((Context) null, (Bitmap) null, (Rect) null, (C30497T) null, this);
    }
}
