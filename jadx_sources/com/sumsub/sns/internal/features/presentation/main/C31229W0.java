package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.W0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31229W0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f63176a;

    /* JADX INFO: renamed from: b */
    public C29124h f63177b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63178c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31251c2 f63179d;

    /* JADX INFO: renamed from: e */
    public int f63180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31229W0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63179d = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63178c = obj;
        this.f63180e |= Integer.MIN_VALUE;
        return this.f63179d.m70646a(false, (C29124h) null, (ContinuationImpl) this);
    }
}
