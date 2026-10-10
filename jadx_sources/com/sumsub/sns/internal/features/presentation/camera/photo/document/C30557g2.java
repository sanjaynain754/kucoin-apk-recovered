package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.g2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30557g2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61714a;

    /* JADX INFO: renamed from: b */
    public C30538d1 f61715b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61716c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61717d;

    /* JADX INFO: renamed from: e */
    public int f61718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30557g2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61717d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61716c = obj;
        this.f61718e |= Integer.MIN_VALUE;
        return this.f61717d.m70310d(this);
    }
}
