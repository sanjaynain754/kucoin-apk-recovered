package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.R1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30493R1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public CameraX$Mode f61559a;

    /* JADX INFO: renamed from: b */
    public C30440B2 f61560b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f61561c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30440B2 f61562d;

    /* JADX INFO: renamed from: e */
    public int f61563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30493R1(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61562d = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61561c = obj;
        this.f61563e |= Integer.MIN_VALUE;
        return this.f61562d.onPrepare(this);
    }
}
