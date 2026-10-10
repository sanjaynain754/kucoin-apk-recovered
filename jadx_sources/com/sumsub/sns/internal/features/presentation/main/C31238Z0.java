package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31238Z0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f63200a;

    /* JADX INFO: renamed from: b */
    public C29124h f63201b;

    /* JADX INFO: renamed from: c */
    public boolean f63202c;

    /* JADX INFO: renamed from: d */
    public boolean f63203d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63204e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31251c2 f63205f;

    /* JADX INFO: renamed from: g */
    public int f63206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31238Z0(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63205f = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63204e = obj;
        this.f63206g |= Integer.MIN_VALUE;
        return this.f63205f.m70644a(null, null, false, false, this);
    }
}
