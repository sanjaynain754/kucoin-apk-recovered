package com.sumsub.sns.internal.features.domain;

import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30304p extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f60903a;

    /* JADX INFO: renamed from: b */
    public Iterator f60904b;

    /* JADX INFO: renamed from: c */
    public String f60905c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60906d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30306q f60907e;

    /* JADX INFO: renamed from: f */
    public int f60908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30304p(C30306q c30306q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60907e = c30306q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60906d = obj;
        this.f60908f |= Integer.MIN_VALUE;
        Object objM70177a = this.f60907e.m70177a(null, this);
        return objM70177a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70177a : Result.m103843boximpl(objM70177a);
    }
}
