package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.net.Uri;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28455g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57975a;

    /* JADX INFO: renamed from: b */
    public int f57976b;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57975a = obj;
        this.f57976b |= Integer.MIN_VALUE;
        return AbstractC28458h.m69332a((Uri) null, (Context) null, this);
    }

    public C28455g(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
