package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30484O0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61530a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30444C2 f61532c;

    /* JADX INFO: renamed from: d */
    public int f61533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30484O0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61532c = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61531b = obj;
        this.f61533d |= Integer.MIN_VALUE;
        return this.f61532c.m70353e(this);
    }
}
