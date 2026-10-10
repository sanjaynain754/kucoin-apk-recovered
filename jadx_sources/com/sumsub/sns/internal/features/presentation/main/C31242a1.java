package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31242a1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63209a;

    /* JADX INFO: renamed from: b */
    public C29124h f63210b;

    /* JADX INFO: renamed from: c */
    public AbstractC29172p f63211c;

    /* JADX INFO: renamed from: d */
    public List f63212d;

    /* JADX INFO: renamed from: e */
    public ReviewStatusType f63213e;

    /* JADX INFO: renamed from: f */
    public C32641a f63214f;

    /* JADX INFO: renamed from: g */
    public C29124h f63215g;

    /* JADX INFO: renamed from: h */
    public AbstractC29172p f63216h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f63217i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C31251c2 f63218j;

    /* JADX INFO: renamed from: k */
    public int f63219k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31242a1(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63218j = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63217i = obj;
        this.f63219k |= Integer.MIN_VALUE;
        return this.f63218j.m70655b(false, null, this);
    }
}
