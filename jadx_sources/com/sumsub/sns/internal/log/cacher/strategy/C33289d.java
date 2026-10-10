package com.sumsub.sns.internal.log.cacher.strategy;

import com.sumsub.sns.internal.log.cacher.C33282j;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.strategy.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33289d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f67863a;

    /* JADX INFO: renamed from: b */
    public C33282j f67864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C33291f f67866d;

    /* JADX INFO: renamed from: e */
    public int f67867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33289d(C33291f c33291f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f67866d = c33291f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67865c = obj;
        this.f67867e |= Integer.MIN_VALUE;
        return this.f67866d.mo71622a(null, null, null, this);
    }
}
