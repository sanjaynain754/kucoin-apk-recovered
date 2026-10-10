package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31273i0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63359a;

    /* JADX INFO: renamed from: b */
    public Object f63360b;

    /* JADX INFO: renamed from: c */
    public ReviewStatusType f63361c;

    /* JADX INFO: renamed from: d */
    public boolean f63362d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63363e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31332p0 f63364f;

    /* JADX INFO: renamed from: g */
    public int f63365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31273i0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63364f = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63363e = obj;
        this.f63365g |= Integer.MIN_VALUE;
        return this.f63364f.m70686a((AbstractC29172p) null, (List) null, (ReviewStatusType) null, false, (ContinuationImpl) this);
    }
}
