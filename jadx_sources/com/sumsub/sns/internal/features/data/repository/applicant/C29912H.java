package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import java.io.File;
import java.util.Map;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29912H extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29914J f60046b;

    /* JADX INFO: renamed from: c */
    public int f60047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29912H(C29914J c29914j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60046b = c29914j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60045a = obj;
        this.f60047c |= Integer.MIN_VALUE;
        return this.f60046b.m69950a((String) null, (File) null, (String) null, (IdentitySide) null, (Map) null, (C29070X) null, (InterfaceC30061a) null, this);
    }
}
