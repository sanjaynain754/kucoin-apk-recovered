package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.camera.C30386l;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28068K extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f57246a;

    /* JADX INFO: renamed from: b */
    public Object f57247b;

    /* JADX INFO: renamed from: c */
    public C29124h f57248c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f57249d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28070L f57250e;

    /* JADX INFO: renamed from: f */
    public int f57251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28068K(AbstractC28070L abstractC28070L, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57250e = abstractC28070L;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57249d = obj;
        this.f57251f |= Integer.MIN_VALUE;
        return this.f57250e.m69065a((InterfaceC29984m) null, (C30386l) null, this);
    }
}
