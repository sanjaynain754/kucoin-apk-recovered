package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30567i0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f61727a;

    /* JADX INFO: renamed from: b */
    public Bitmap f61728b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61729c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30444C2 f61730d;

    /* JADX INFO: renamed from: e */
    public int f61731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30567i0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61730d = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61729c = obj;
        this.f61731e |= Integer.MIN_VALUE;
        return this.f61730d.m70331a((Context) null, (Bitmap) null, this);
    }
}
