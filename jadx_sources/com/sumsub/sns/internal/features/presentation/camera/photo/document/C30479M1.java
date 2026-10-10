package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.M1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30479M1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f61515a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61517c;

    /* JADX INFO: renamed from: d */
    public int f61518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30479M1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61517c = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61516b = obj;
        this.f61518d |= Integer.MIN_VALUE;
        return this.f61517c.m70306b(null, this);
    }
}
