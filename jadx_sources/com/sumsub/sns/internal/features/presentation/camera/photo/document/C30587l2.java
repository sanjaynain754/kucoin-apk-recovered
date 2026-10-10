package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.l2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30587l2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61774a;

    /* JADX INFO: renamed from: b */
    public C30538d1 f61775b;

    /* JADX INFO: renamed from: c */
    public C30516Z0 f61776c;

    /* JADX INFO: renamed from: d */
    public String f61777d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f61778e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30440B2 f61779f;

    /* JADX INFO: renamed from: g */
    public int f61780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30587l2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61779f = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61778e = obj;
        this.f61780g |= Integer.MIN_VALUE;
        return this.f61779f.m70315g(this);
    }
}
