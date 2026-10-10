package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31176E0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29124h f63035a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63037c;

    /* JADX INFO: renamed from: d */
    public int f63038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31176E0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63037c = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63036b = obj;
        this.f63038d |= Integer.MIN_VALUE;
        return this.f63037c.m70643a((C29124h) null, this);
    }
}
