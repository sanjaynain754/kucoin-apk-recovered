package com.sumsub.sns.internal.features.data.repository.socket;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30036b extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60334a;

    /* JADX INFO: renamed from: b */
    public int f60335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30037c f60336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30036b(C30037c c30037c, Continuation continuation) {
        super(continuation);
        this.f60336c = c30037c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60334a = obj;
        this.f60335b |= Integer.MIN_VALUE;
        return this.f60336c.emit(null, this);
    }
}
