package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31504v extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f63921a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31476A f63923c;

    /* JADX INFO: renamed from: d */
    public int f63924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31504v(C31476A c31476a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63923c = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63922b = obj;
        this.f63924d |= Integer.MIN_VALUE;
        return this.f63923c.m70742a((List) null, this);
    }
}
