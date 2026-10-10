package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30475L0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Function0 f61500a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41669n f61501b;

    /* JADX INFO: renamed from: c */
    public C30486P f61502c;

    /* JADX INFO: renamed from: d */
    public C30477M f61503d;

    /* JADX INFO: renamed from: e */
    public String f61504e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f61505f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C30444C2 f61506g;

    /* JADX INFO: renamed from: h */
    public int f61507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30475L0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61506g = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61505f = obj;
        this.f61507h |= Integer.MIN_VALUE;
        return this.f61506g.m70339a((Function0) null, this);
    }
}
