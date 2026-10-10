package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.t0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30631t0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f61882a;

    /* JADX INFO: renamed from: b */
    public Object f61883b;

    /* JADX INFO: renamed from: c */
    public Object f61884c;

    /* JADX INFO: renamed from: d */
    public boolean f61885d;

    /* JADX INFO: renamed from: e */
    public long f61886e;

    /* JADX INFO: renamed from: f */
    public int f61887f;

    /* JADX INFO: renamed from: g */
    public int f61888g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f61889h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C30444C2 f61890i;

    /* JADX INFO: renamed from: j */
    public int f61891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30631t0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61890i = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61889h = obj;
        this.f61891j |= Integer.MIN_VALUE;
        return this.f61890i.m70330a((Context) null, (Bitmap) null, (Rect) null, this);
    }
}
