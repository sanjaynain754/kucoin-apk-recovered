package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32683H extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public CharSequence f66746a;

    /* JADX INFO: renamed from: b */
    public String f66747b;

    /* JADX INFO: renamed from: c */
    public CharSequence f66748c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66749d;

    /* JADX INFO: renamed from: e */
    public int f66750e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f66751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C32720j0 f66752g;

    /* JADX INFO: renamed from: h */
    public int f66753h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32683H(C32720j0 c32720j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66752g = c32720j0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66751f = obj;
        this.f66753h |= Integer.MIN_VALUE;
        return this.f66752g.m71301a((AbstractC29172p) null, (CharSequence) null, this);
    }
}
