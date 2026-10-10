package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.J1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30470J1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f61449a;

    /* JADX INFO: renamed from: b */
    public Object f61450b;

    /* JADX INFO: renamed from: c */
    public Object f61451c;

    /* JADX INFO: renamed from: d */
    public long f61452d;

    /* JADX INFO: renamed from: e */
    public int f61453e;

    /* JADX INFO: renamed from: f */
    public int f61454f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f61455g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30440B2 f61456h;

    /* JADX INFO: renamed from: i */
    public int f61457i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30470J1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61456h = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61455g = obj;
        this.f61457i |= Integer.MIN_VALUE;
        return this.f61456h.m70285a((Context) null, (Bitmap) null, (Rect) null, this);
    }
}
