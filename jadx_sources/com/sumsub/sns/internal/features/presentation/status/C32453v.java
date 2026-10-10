package com.sumsub.sns.internal.features.presentation.status;

import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32453v extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66147a;

    /* JADX INFO: renamed from: b */
    public Object f66148b;

    /* JADX INFO: renamed from: c */
    public Object f66149c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66150d;

    /* JADX INFO: renamed from: e */
    public CharSequence f66151e;

    /* JADX INFO: renamed from: f */
    public boolean f66152f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f66153g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C32403L f66154h;

    /* JADX INFO: renamed from: i */
    public int f66155i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32453v(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66154h = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66153g = obj;
        this.f66155i |= Integer.MIN_VALUE;
        return C32403L.m71113a(this.f66154h, this);
    }
}
