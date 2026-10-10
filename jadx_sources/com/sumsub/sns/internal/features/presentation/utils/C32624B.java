package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32624B extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C32635M f66562a;

    /* JADX INFO: renamed from: b */
    public List f66563b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f66564c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f66565d;

    /* JADX INFO: renamed from: e */
    public int f66566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32624B(C32635M c32635m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f66565d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66564c = obj;
        this.f66566e |= Integer.MIN_VALUE;
        return C32635M.m71222a(this.f66565d, (C29054T) null, this);
    }
}
