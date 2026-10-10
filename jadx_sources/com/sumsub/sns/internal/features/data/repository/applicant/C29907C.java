package com.sumsub.sns.internal.features.data.repository.applicant;

import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29907C extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29914J f60031b;

    /* JADX INFO: renamed from: c */
    public int f60032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29907C(C29914J c29914j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60031b = c29914j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60030a = obj;
        this.f60032c |= Integer.MIN_VALUE;
        return this.f60031b.m69957a((List) null, this);
    }
}
