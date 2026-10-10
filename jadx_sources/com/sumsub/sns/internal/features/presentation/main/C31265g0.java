package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31265g0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C29082a f63327a;

    /* JADX INFO: renamed from: b */
    public Document f63328b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31332p0 f63330d;

    /* JADX INFO: renamed from: e */
    public int f63331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31265g0(C31332p0 c31332p0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63330d = c31332p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63329c = obj;
        this.f63331e |= Integer.MIN_VALUE;
        return this.f63330d.m70683a((C29082a) null, (List) null, this);
    }
}
