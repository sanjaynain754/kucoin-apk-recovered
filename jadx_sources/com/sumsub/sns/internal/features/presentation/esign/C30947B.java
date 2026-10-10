package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30947B extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f62512a;

    /* JADX INFO: renamed from: b */
    public String f62513b;

    /* JADX INFO: renamed from: c */
    public int f62514c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62515d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30997n0 f62516e;

    /* JADX INFO: renamed from: f */
    public int f62517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30947B(C30997n0 c30997n0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62516e = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62515d = obj;
        this.f62517f |= Integer.MIN_VALUE;
        return this.f62516e.m70551b((C29752Y) null, this);
    }
}
