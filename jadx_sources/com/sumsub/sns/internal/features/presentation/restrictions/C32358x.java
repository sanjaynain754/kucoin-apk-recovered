package com.sumsub.sns.internal.features.presentation.restrictions;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32358x extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65931a;

    /* JADX INFO: renamed from: b */
    public int f65932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32359y f65933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32358x(C32359y c32359y, Continuation continuation) {
        super(continuation);
        this.f65933c = c32359y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f65931a = obj;
        this.f65932b |= Integer.MIN_VALUE;
        return this.f65933c.emit(null, this);
    }
}
