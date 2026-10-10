package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.v2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30643v2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32635M f61917a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61919c;

    /* JADX INFO: renamed from: d */
    public int f61920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30643v2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61919c = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61918b = obj;
        this.f61920d |= Integer.MIN_VALUE;
        return this.f61919c.m70294a((C32635M) null, this);
    }
}
