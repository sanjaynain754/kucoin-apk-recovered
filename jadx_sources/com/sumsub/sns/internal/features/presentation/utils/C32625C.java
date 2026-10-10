package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32625C extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC28052C f66567a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f66569c;

    /* JADX INFO: renamed from: d */
    public int f66570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32625C(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66569c = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66568b = obj;
        this.f66570d |= Integer.MIN_VALUE;
        return this.f66569c.m71232a((List) null, (DocumentSideness) null, this);
    }
}
