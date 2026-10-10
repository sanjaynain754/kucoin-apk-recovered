package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30615q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61855b;

    /* JADX INFO: renamed from: c */
    public int f61856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30615q0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61855b = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61854a = obj;
        this.f61856c |= Integer.MIN_VALUE;
        return this.f61855b.m70334a((Context) null, this);
    }
}
