package com.sumsub.sns.internal.log.cacher;

import java.io.File;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33283k extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public File f67844a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33284l f67846c;

    /* JADX INFO: renamed from: d */
    public int f67847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33283k(C33284l c33284l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67846c = c33284l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67845b = obj;
        this.f67847d |= Integer.MIN_VALUE;
        return this.f67846c.m71621a(null, this);
    }
}
