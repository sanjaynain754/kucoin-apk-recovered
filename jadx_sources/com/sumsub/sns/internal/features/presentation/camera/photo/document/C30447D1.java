package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.core.presentation.camera.C28734c;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.D1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30447D1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C28734c f61378a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61380c;

    /* JADX INFO: renamed from: d */
    public int f61381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30447D1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61380c = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61379b = obj;
        this.f61381d |= Integer.MIN_VALUE;
        return C30440B2.m70275a(this.f61380c, (C28734c) null, this);
    }
}
