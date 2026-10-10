package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.domain.navigation.model.C30274C;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31313i extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63459a;

    /* JADX INFO: renamed from: b */
    public C30274C f63460b;

    /* JADX INFO: renamed from: c */
    public Object f63461c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63462d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31318n f63463e;

    /* JADX INFO: renamed from: f */
    public int f63464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31313i(C31318n c31318n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63463e = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63462d = obj;
        this.f63464f |= Integer.MIN_VALUE;
        return this.f63463e.m70677a(false, null, this);
    }
}
