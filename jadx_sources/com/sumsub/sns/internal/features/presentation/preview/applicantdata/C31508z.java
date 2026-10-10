package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import java.util.ArrayList;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31508z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ArrayList f63931a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31476A f63933c;

    /* JADX INFO: renamed from: d */
    public int f63934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31508z(C31476A c31476a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f63933c = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f63932b = obj;
        this.f63934d |= Integer.MIN_VALUE;
        return this.f63933c.m70741a((List) null, (List) null, this);
    }
}
