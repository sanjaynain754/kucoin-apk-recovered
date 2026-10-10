package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32394C extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29124h f65989a;

    /* JADX INFO: renamed from: b */
    public AbstractC29172p f65990b;

    /* JADX INFO: renamed from: c */
    public List f65991c;

    /* JADX INFO: renamed from: d */
    public ReviewStatusType f65992d;

    /* JADX INFO: renamed from: e */
    public ReviewStatusType f65993e;

    /* JADX INFO: renamed from: f */
    public int f65994f;

    /* JADX INFO: renamed from: g */
    public int f65995g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f65996h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C32403L f65997i;

    /* JADX INFO: renamed from: j */
    public int f65998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32394C(C32403L c32403l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65997i = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65996h = obj;
        this.f65998j |= Integer.MIN_VALUE;
        return this.f65997i.m71120b(null, null, null, null, this);
    }
}
