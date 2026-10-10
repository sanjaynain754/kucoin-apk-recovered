package com.sumsub.sns.internal.features.data.repository.dynamic;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29965H extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InterfaceC41709m0 f60184a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60186c;

    /* JADX INFO: renamed from: d */
    public int f60187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29965H(C29967J c29967j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60186c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60185b = obj;
        this.f60187d |= Integer.MIN_VALUE;
        return C29967J.m70038a(this.f60186c, (InterfaceC41709m0) null, this);
    }
}
