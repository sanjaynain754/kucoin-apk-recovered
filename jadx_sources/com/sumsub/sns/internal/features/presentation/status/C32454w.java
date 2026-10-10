package com.sumsub.sns.internal.features.presentation.status;

import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32454w extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66156a;

    /* JADX INFO: renamed from: b */
    public List f66157b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32403L f66159d;

    /* JADX INFO: renamed from: e */
    public int f66160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32454w(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66159d = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66158c = obj;
        this.f66160e |= Integer.MIN_VALUE;
        return this.f66159d.m71117a(null, null, null, null, this);
    }
}
