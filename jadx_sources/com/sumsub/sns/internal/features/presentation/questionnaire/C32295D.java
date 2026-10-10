package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30084S;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32295D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C30084S f65777a;

    /* JADX INFO: renamed from: b */
    public C29983l f65778b;

    /* JADX INFO: renamed from: c */
    public C29124h f65779c;

    /* JADX INFO: renamed from: d */
    public AbstractC29172p f65780d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f65781e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C32300I f65782f;

    /* JADX INFO: renamed from: g */
    public int f65783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32295D(C32300I c32300i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f65782f = c32300i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65781e = obj;
        this.f65783g |= Integer.MIN_VALUE;
        return this.f65782f.m71085a(null, null, this);
    }
}
