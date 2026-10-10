package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.network.prooface.C29894i;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32047W extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f65195a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32109k0 f65197c;

    /* JADX INFO: renamed from: d */
    public int f65198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32047W(C32109k0 c32109k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65197c = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65196b = obj;
        this.f65198d |= Integer.MIN_VALUE;
        return this.f65197c.m71036a((C29894i) null, this);
    }
}
