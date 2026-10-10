package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.presentation.helper.C28879c;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32398G extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f66014a;

    /* JADX INFO: renamed from: b */
    public Object f66015b;

    /* JADX INFO: renamed from: c */
    public Object f66016c;

    /* JADX INFO: renamed from: d */
    public Object f66017d;

    /* JADX INFO: renamed from: e */
    public Object f66018e;

    /* JADX INFO: renamed from: f */
    public List f66019f;

    /* JADX INFO: renamed from: g */
    public Object f66020g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f66021h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C32403L f66022i;

    /* JADX INFO: renamed from: j */
    public int f66023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32398G(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66022i = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66021h = obj;
        this.f66023j |= Integer.MIN_VALUE;
        return this.f66022i.m71116a((C28879c) null, this);
    }
}
