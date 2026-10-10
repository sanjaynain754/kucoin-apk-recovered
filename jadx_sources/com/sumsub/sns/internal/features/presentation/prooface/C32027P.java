package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32027P extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f65107a;

    /* JADX INFO: renamed from: b */
    public C29124h f65108b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65109c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32109k0 f65110d;

    /* JADX INFO: renamed from: e */
    public int f65111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32027P(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65110d = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65109c = obj;
        this.f65111e |= Integer.MIN_VALUE;
        return this.f65110d.m71037a((String) null, this);
    }
}
