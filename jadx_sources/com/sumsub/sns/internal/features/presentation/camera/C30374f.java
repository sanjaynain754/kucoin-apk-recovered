package com.sumsub.sns.internal.features.presentation.camera;

import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30374f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ImageProxy f61100a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61101b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30376g f61102c;

    /* JADX INFO: renamed from: d */
    public int f61103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30374f(C30376g c30376g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61102c = c30376g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61101b = obj;
        this.f61103d |= Integer.MIN_VALUE;
        return this.f61102c.mo69576a((ImageProxy) null, (C28758x) null, this);
    }
}
