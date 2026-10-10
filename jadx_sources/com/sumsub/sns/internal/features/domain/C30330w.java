package com.sumsub.sns.internal.features.domain;

import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30330w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30314u f60988a;

    /* JADX INFO: renamed from: b */
    public Map f60989b;

    /* JADX INFO: renamed from: c */
    public String f60990c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60991d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30332x f60992e;

    /* JADX INFO: renamed from: f */
    public int f60993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30330w(C30332x c30332x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60992e = c30332x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60991d = obj;
        this.f60993f |= Integer.MIN_VALUE;
        return this.f60992e.m70191a(null, this);
    }
}
