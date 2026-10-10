package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.z1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30661z1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32635M f61958a;

    /* JADX INFO: renamed from: b */
    public C29054T f61959b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61960c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61961d;

    /* JADX INFO: renamed from: e */
    public int f61962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30661z1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61961d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61960c = obj;
        this.f61962e |= Integer.MIN_VALUE;
        return this.f61961d.m70293a((C32635M) null, (C29054T) null, this);
    }
}
