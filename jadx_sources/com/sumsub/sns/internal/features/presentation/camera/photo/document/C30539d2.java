package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.d2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30539d2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Function0 f61671a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41669n f61672b;

    /* JADX INFO: renamed from: c */
    public C30538d1 f61673c;

    /* JADX INFO: renamed from: d */
    public C30516Z0 f61674d;

    /* JADX INFO: renamed from: e */
    public String f61675e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f61676f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30440B2 f61677g;

    /* JADX INFO: renamed from: h */
    public int f61678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30539d2(C30440B2 c30440b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61677g = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61676f = obj;
        this.f61678h |= Integer.MIN_VALUE;
        return this.f61677g.m70296a((Function0) null, this);
    }
}
