package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31298m0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63423a;

    /* JADX INFO: renamed from: b */
    public C29124h f63424b;

    /* JADX INFO: renamed from: c */
    public AbstractC29172p f63425c;

    /* JADX INFO: renamed from: d */
    public List f63426d;

    /* JADX INFO: renamed from: e */
    public ReviewStatusType f63427e;

    /* JADX INFO: renamed from: f */
    public C32641a f63428f;

    /* JADX INFO: renamed from: g */
    public C29124h f63429g;

    /* JADX INFO: renamed from: h */
    public AbstractC29172p f63430h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f63431i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C31332p0 f63432j;

    /* JADX INFO: renamed from: k */
    public int f63433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31298m0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63432j = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63431i = obj;
        this.f63433k |= Integer.MIN_VALUE;
        return this.f63432j.m70689a(false, (C29124h) null, (ContinuationImpl) this);
    }
}
