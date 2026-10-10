package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30490Q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f61549a;

    /* JADX INFO: renamed from: b */
    public C30486P f61550b;

    /* JADX INFO: renamed from: c */
    public C30477M f61551c;

    /* JADX INFO: renamed from: d */
    public String f61552d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f61553e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30444C2 f61554f;

    /* JADX INFO: renamed from: g */
    public int f61555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30490Q0(C30444C2 c30444c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f61554f = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61553e = obj;
        this.f61555g |= Integer.MIN_VALUE;
        return this.f61554f.m70354f(this);
    }
}
