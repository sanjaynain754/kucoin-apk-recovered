package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31470v extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30151v f63826a;

    /* JADX INFO: renamed from: b */
    public C29124h f63827b;

    /* JADX INFO: renamed from: c */
    public C30145p f63828c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63829d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31472x f63830e;

    /* JADX INFO: renamed from: f */
    public int f63831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31470v(C31472x c31472x, Continuation continuation) {
        super(continuation);
        this.f63830e = c31472x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63829d = obj;
        this.f63831f |= Integer.MIN_VALUE;
        return this.f63830e.m70737a((C30145p) null, (Continuation) this);
    }
}
