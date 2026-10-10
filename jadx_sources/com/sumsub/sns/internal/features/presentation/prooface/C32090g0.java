package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32090g0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65303a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65305c;

    /* JADX INFO: renamed from: d */
    public int f65306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32090g0(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65305c = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65304b = obj;
        this.f65306d |= Integer.MIN_VALUE;
        return this.f65305c.m71045b(this);
    }
}
