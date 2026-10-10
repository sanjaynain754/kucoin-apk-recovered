package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.C29015J;
import java.util.ArrayList;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32626D extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ArrayList f66571a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f66573c;

    /* JADX INFO: renamed from: d */
    public int f66574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32626D(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66573c = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66572b = obj;
        this.f66574d |= Integer.MIN_VALUE;
        return this.f66573c.m71228a((C29015J) null, this);
    }
}
