package com.sumsub.sns.internal.features.presentation.camera;

import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30345H extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ImageProxy f61019a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30346I f61021c;

    /* JADX INFO: renamed from: d */
    public int f61022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30345H(C30346I c30346i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61021c = c30346i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61020b = obj;
        this.f61022d |= Integer.MIN_VALUE;
        return this.f61021c.mo69576a((ImageProxy) null, (C28758x) null, this);
    }
}
