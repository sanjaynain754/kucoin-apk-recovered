package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29964G extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f60180a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60182c;

    /* JADX INFO: renamed from: d */
    public int f60183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29964G(C29967J c29967j, Continuation continuation) {
        super(continuation);
        this.f60182c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f60181b = obj;
        this.f60183d |= Integer.MIN_VALUE;
        return this.f60182c.m70040a((Object) null, (Function1) null, this);
    }
}
