package com.sumsub.sns.internal.core.analytics;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28376o extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public InputStreamReader f57857a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28378q f57859c;

    /* JADX INFO: renamed from: d */
    public int f57860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28376o(C28378q c28378q, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57859c = c28378q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57858b = obj;
        this.f57860d |= Integer.MIN_VALUE;
        return this.f57859c.mo68969a((ByteArrayInputStream) null, this);
    }
}
