package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28933q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28935s f58823a;

    /* JADX INFO: renamed from: b */
    public C29697t2 f58824b;

    /* JADX INFO: renamed from: c */
    public C31283h f58825c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f58826d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28935s f58827e;

    /* JADX INFO: renamed from: f */
    public int f58828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28933q(AbstractC28935s abstractC28935s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58827e = abstractC28935s;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f58826d = obj;
        this.f58828f |= Integer.MIN_VALUE;
        return AbstractC28935s.m69702a(this.f58827e, this);
    }
}
