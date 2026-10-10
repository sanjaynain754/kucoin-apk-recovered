package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.net.Uri;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28452f extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f57969a;

    /* JADX INFO: renamed from: b */
    public Uri f57970b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f57971c;

    /* JADX INFO: renamed from: d */
    public int f57972d;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57971c = obj;
        this.f57972d |= Integer.MIN_VALUE;
        return AbstractC28458h.m69331a((Context) null, (Uri) null, (String) null, this);
    }

    public C28452f(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
