package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30310s extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Map f60932a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30312t f60934c;

    /* JADX INFO: renamed from: d */
    public int f60935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30310s(C30312t c30312t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60934c = c30312t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60933b = obj;
        this.f60935d |= Integer.MIN_VALUE;
        return this.f60934c.m70181a((Document) null, (String) null, (Map) null, this);
    }
}
