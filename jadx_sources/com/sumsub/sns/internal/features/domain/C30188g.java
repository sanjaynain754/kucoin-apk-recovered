package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import java.io.Serializable;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30188g extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Serializable f60671a;

    /* JADX INFO: renamed from: b */
    public Object f60672b;

    /* JADX INFO: renamed from: c */
    public Ref.ObjectRef f60673c;

    /* JADX INFO: renamed from: d */
    public C29124h f60674d;

    /* JADX INFO: renamed from: e */
    public String f60675e;

    /* JADX INFO: renamed from: f */
    public Serializable f60676f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f60677g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C30216h f60678h;

    /* JADX INFO: renamed from: i */
    public int f60679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30188g(C30216h c30216h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60678h = c30216h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60677g = obj;
        this.f60679i |= Integer.MIN_VALUE;
        return this.f60678h.m70143a(null, null, this);
    }
}
