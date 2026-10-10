package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31194K0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29082a f63065a;

    /* JADX INFO: renamed from: b */
    public Document f63066b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31251c2 f63068d;

    /* JADX INFO: renamed from: e */
    public int f63069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31194K0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63068d = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63067c = obj;
        this.f63069e |= Integer.MIN_VALUE;
        return C31251c2.m70637a(this.f63068d, (C29082a) null, (List) null, this);
    }
}
